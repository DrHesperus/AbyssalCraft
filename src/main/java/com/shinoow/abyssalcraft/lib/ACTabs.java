/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2017 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.api.item.ACItems;

/**
 * Creative Tab references
 * @author shinoow
 */
public class ACTabs {

	public static final CreativeTabs tabBlock = new CreativeTabs("acblocks"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ACBlocks.darkstone));
		}
	};
	public static final CreativeTabs tabItems = new CreativeTabs("acitems"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ACItems.necronomicon);
		}
	};
	public static final CreativeTabs tabTools = new CreativeTabs("actools"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ACItems.darkstone_axe);
		}
	};
	public static final CreativeTabs tabCombat = new CreativeTabs("acctools"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ACItems.darkstone_sword);
		}
	};
	public static final CreativeTabs tabFood = new CreativeTabs("acfood"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ACItems.iron_plate);
		}
	};
	public static final CreativeTabs tabDecoration = new CreativeTabs("acdblocks"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ACBlocks.wooden_crate));
		}
	};
	public static final CreativeTabs tabCrystals = new CreativeTabs("accrystals"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ACBlocks.crystallizer_idle));
		}
	};
	public static final CreativeTabs tabCoins = new CreativeTabs("accoins"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ACItems.coin);
		}
	};
}