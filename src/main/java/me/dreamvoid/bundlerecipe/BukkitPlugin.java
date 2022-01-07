package me.dreamvoid.bundlerecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.addRecipe(new ShapedRecipe(new NamespacedKey(this, "bundle"), new ItemStack(Material.BUNDLE))
                .shape("SRS", "R R", "RRR")
                .setIngredient('S', Material.STRING)
                .setIngredient('R', Material.RABBIT_HIDE)
        );
    }

    @Override
    public void onDisable() {
        Bukkit.clearRecipes();
    }
}
