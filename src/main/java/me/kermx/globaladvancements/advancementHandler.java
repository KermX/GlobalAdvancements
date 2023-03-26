package me.kermx.globaladvancements;

import org.bukkit.Bukkit;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class advancementHandler implements Listener {
    public advancementHandler(GlobalAdvancements plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);}
    @EventHandler
    public void onAdv(PlayerAdvancementDoneEvent event) {
        Advancement a = event.getAdvancement();
        for (Player player : Bukkit.getOnlinePlayers())
            for (String criteria : player.getAdvancementProgress(a).getRemainingCriteria())
                player.getAdvancementProgress(a).awardCriteria(criteria);
    }
}
