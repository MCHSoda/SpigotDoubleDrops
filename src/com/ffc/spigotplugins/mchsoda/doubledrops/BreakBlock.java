package com.ffc.spigotplugins.mchsoda.doubledrops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlock implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        Block blockBroken = event.getBlock();

        if (blockBroken.getType() == Material.ANCIENT_DEBRIS);
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack ancientdebris = new ItemStack(Material.ANCIENT_DEBRIS, 2);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), ancientdebris);


        if (blockBroken.getType() == Material.LAPIS_LAZULI);
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI, 2);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), lapis);


        if (blockBroken.getType() == Material.EMERALD_ORE);
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack emeralds = new ItemStack(Material.EMERALD, 2);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), emeralds);


        if (blockBroken.getType() == Material.DIAMOND_ORE);
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack diamonds = new ItemStack(Material.DIAMOND, 2);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamonds);
            }

    }
