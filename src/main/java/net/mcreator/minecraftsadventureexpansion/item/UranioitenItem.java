
package net.mcreator.minecraftsadventureexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class UranioitenItem extends Item {
	public UranioitenItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("uranioiten");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
