package com.sg.mob_spawn;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.mob_spawn.spawn_events.SpawnEvents;

public class SGMobSpawn implements ModInitializer {
	public static final String MOD_ID = "sg-mob-spawn";

	

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SpawnEvents.registerBreezeSpawn();
		SpawnEvents.registerCaveSpiderSpawn();
		SpawnEvents.registerSilverfishSpawn();
		SpawnEvents.registerIllusionerSpawn();
		SpawnEvents.registerZombieHorseSpawn();
	}
}