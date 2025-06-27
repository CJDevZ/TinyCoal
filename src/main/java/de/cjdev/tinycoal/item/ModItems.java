package de.cjdev.tinycoal.item;

import de.cjdev.papermodapi.api.item.CustomItem;
import de.cjdev.papermodapi.api.item.CustomItems;
import de.cjdev.recipeapi.api.item.RecipeItemSettings;
import org.bukkit.Material;

import static de.cjdev.tinycoal.TinyCoal.b;

public interface ModItems {
    CustomItem TINY_COAL = CustomItems.register(b("tinycoal"), TinyCoalItem::new, new RecipeItemSettings().fuel(200).baseMaterial(Material.COAL));
    CustomItem TINY_CHARCOAL = CustomItems.register(b("tinycharcoal"), TinyCoalItem::new, new RecipeItemSettings().fuel(200).baseMaterial(Material.CHARCOAL));

    static void a() {}
}
