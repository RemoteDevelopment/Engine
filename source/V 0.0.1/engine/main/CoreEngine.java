package engine.main;

import static engine.logging.Logger.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;

import engine.Time;
import engine.gfx.Renderer;
import engine.gfx.model.*;
import engine.io.*;
import engine.logging.Logger;
import engine.maths.Vector2f;
import engine.util.Util;

public class CoreEngine extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	private Thread thread;
	private boolean running = false;

	private Renderer renderer;

	public CoreEngine() {

		// create window and then start thread

		log("Setting up resources", INFO);
		ResourceManager.setup();

		log("Creating window", INFO);
		Window window = Window.createWindow(800, 600, "Engine test 0.1", this);
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cleanUp();
			}
		});
		init();

	}

	private void init() {
		log("Initializing CoreEngine", Logger.INFO);

		renderer = new Renderer();

	}

	public void run() {
		log("Starting gameloop", Logger.INFO);
		long lastTime = System.nanoTime();
		final double numupdates = 60.0;
		double nanoSeconds = 1000000000 / numupdates;
		double delta = 0;
		int frames = 0;
		int updates = 0;
		long timer = System.currentTimeMillis();
		while (running) {
			long currentTime = System.nanoTime();
			delta += (currentTime - lastTime) / nanoSeconds;

			lastTime = currentTime;
			if (delta >= 1) {
				update();
				updates++;
				delta--;
			}

			render();
			frames++;
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				log("Frames: " + frames + " Updates: " + updates, Logger.INFO);
				updates = 0;
				frames = 0;
			}
		}
		stop();
	}

	private void update() {
		Model cube = new Line(new Vector2f(100, 100), new Vector2f(200, 0));

		renderer.renderModel(cube);
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600);

		renderer.render(g, (Graphics2D) g);

		g.dispose();
		bs.show();
	}

	public static void main(String[] args) {
		log("Starting engine", Logger.INFO);
		CoreEngine main = new CoreEngine();
		main.start();

	}

	private void start() {
		running = true;
		thread = new Thread(this, "Engine-MainThread");
		thread.start();
	}

	private void stop() {
		running = false;
		try {
			thread.join(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void cleanUp() {
		log("Cleaning up", INFO);
		FileUtils.write("./data/logs/log_" + Util.generateRandomNumber(10) + ".txt","[LOG] " + Time.getDate() + "\n" + getLog() );
		
		
		stop();
	}

}
