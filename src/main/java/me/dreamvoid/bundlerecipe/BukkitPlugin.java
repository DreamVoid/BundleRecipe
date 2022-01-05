package me.dreamvoid.bundlerecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class BukkitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "bundle"), new ItemStack(Material.BUNDLE));
        recipe.shape(Arrays.asList("SRS","R R","RRR").toArray(new String[0]));
        recipe.setIngredient('S',Material.STRING);
        recipe.setIngredient('R',Material.RABBIT_HIDE);
        Bukkit.addRecipe(recipe);
    }
}
