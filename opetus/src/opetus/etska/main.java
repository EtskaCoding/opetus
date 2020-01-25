package opetus.etska;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{


	private static Plugin plugin;

    @Override 
    public void onEnable() {
    	plugin = this;
    	getCommand("komento").setExecutor(new Komento());
	}
    
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
    	for (Listener listener : listeners) {
    	Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
    	}
    }
    
    public static Plugin getPlugin() {
    	return plugin;
    }
}
