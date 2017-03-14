package com.tobiasrocks2004.magicraft;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MagiCraft.MOD_ID, name = MagiCraft.MOD_NAME, version = MagiCraft.VERSION, dependencies = MagiCraft.DEPENDENCIES)
public class MagiCraft {
	
	//Constants
	public static final String MOD_ID = "magicraft";
	public static final String MOD_NAME = "MagiCraft";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2228,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; //magicraft:
	
	//Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static MagiCraft instance;
	
	@SidedProxy(clientSide = "com.tobiasrocks2004.magicraft.ClientProxy", serverSide = "com.tobiasrocks2004.magicraft.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		proxy.preInit(e);
	}
	
	public void init(FMLInitializationEvent e) {
		
		proxy.init(e);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
		proxy.postInit(e);
	}
}
