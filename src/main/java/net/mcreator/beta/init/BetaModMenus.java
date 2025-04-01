
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.beta.world.inventory.InvintoryFakeMenu;
import net.mcreator.beta.BetaMod;

public class BetaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BetaMod.MODID);
	public static final RegistryObject<MenuType<InvintoryFakeMenu>> INVINTORY_FAKE = REGISTRY.register("invintory_fake", () -> IForgeMenuType.create(InvintoryFakeMenu::new));
}
