package com.ffc.spigotplugins.mchsoda.doubledrops;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        getServer().getPluginManager().registerEvents(new BreakBlock(), this);

    }


    @Override
    public void onDisable(){

    }

}
