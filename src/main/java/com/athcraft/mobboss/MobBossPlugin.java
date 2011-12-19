/**
 * MobBoss Plugin used to control mob spawning on bukkit server.
 * Originally developed for Athcraft. http://athcraft.com
 *
 * @author Alan Moss <alyawn@gmail.com>
 */
package com.athcraft.mobboss;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MobBossPlugin extends JavaPlugin {

    public void onEnable() {
        PluginDescriptionFile descFile = this.getDescription();
        System.out.println(descFile.getName() + " version " + descFile.getVersion() + " is enabled!");
    }


    public void onDisable() {
    }

}

