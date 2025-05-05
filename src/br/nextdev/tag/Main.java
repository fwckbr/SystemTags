package br.nextdev.tag;

import br.nextdev.tag.API.TagAPI;
import br.nextdev.tag.TagManager.TagCommand;
import br.nextdev.tag.TagManager.TagsCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage("§aNTAG: Iniciado com sucesso.");

        Bukkit.getPluginManager().registerEvents(new TagAPI(), this);

        getCommand("tag").setExecutor(new TagCommand());
        getCommand("tags").setExecutor(new TagsCommand());
    }
}
