package com.amadornes.framez.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.amadornes.framez.api.FramezApi;
import com.amadornes.framez.ref.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabFramez extends CreativeTabs {

    public static final CreativeTabFramez inst = new CreativeTabFramez();

    public CreativeTabFramez() {

        super(ModInfo.MODID);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {

        return null;
    }

    @Override
    public ItemStack getIconItemStack() {

        return FramezApi.inst().getModifierRegistry().getFrameStack();
    }

}
