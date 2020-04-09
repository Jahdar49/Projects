package com.tutorial.main;

import java.util.LinkedList;
import java.util.Random;

import com.tutorial.main.Game.STATE;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private Game game;
	private Random r = new Random();
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	private int scoreKeep = 0;
	
	
	public Spawn(Handler handler, HUD hud, Game game) {
		this.handler = handler;
		this.hud = hud;
		this.game = game;
	}


	public void tick() {
		scoreKeep++;
		
		if(scoreKeep >= 250) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			if(game.diff == 0) 
			{
				
				if(hud.getLevel()==2) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 3) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 4) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 5) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 6) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 7) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 10) {
					handler.clearEnemy();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));
				}else if(hud.getLevel() == 15) {
					handler.clearEnemy();
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 16) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 17) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 18) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 19) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 20) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 25) {
					handler.clearEnemy();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));
				}else if(hud.getLevel() ==30 ) {
					handler.clearEnemy();
				}else if(hud.getLevel() == 31) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 32) {
					handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				}else if(hud.getLevel() == 32) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				}else if(hud.getLevel() == 33) {
					handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 34) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() == 35) {
					handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				}else if(hud.getLevel() ==36 ) {
					handler.clearEnemy();
					handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));	
				}else if(hud.getLevel() == 37){
					handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));
				}else if(hud.getLevel() == 42) {
					handler.clearEnemy();					
					for(int i = 0; i < 20; i++) {
					handler.addObject(new MenuParticle(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle, handler));
					Game.gameState = STATE.Win;
						}
					}
				}else if(game.diff == 1) 
			{
					
			for(int i = 0; i<2; i++) {
			if(hud.getLevel()==2) {
			handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
			}else if(hud.getLevel() == 3) {
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
			}else if(hud.getLevel() == 4) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 5) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 6) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 7) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 10) {
				handler.clearEnemy();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));
			}else if(hud.getLevel() == 15) {
				handler.clearEnemy();
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
			}else if(hud.getLevel() == 16) {
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
			}else if(hud.getLevel() == 17) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 18) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 19) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 20) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 25) {
				handler.clearEnemy();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));
			}else if(hud.getLevel() ==30 ) {
				handler.clearEnemy();
			}else if(hud.getLevel() == 31) {
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
			}else if(hud.getLevel() == 32) {
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HardEnemy, handler));
			}else if(hud.getLevel() == 32) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 33) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 34) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 35) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() ==36 ) {
				handler.clearEnemy();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));	
			}else if(hud.getLevel() == 37){
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 120, ID.EnemyBoss, handler));
			}else if(hud.getLevel() == 42) {
				handler.clearEnemy();
				for( i = 0; i < 20; i++) {
					handler.addObject(new MenuParticle(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle, handler));
				Game.gameState = STATE.Win;
				
		}
	}
			}}}}}