package com.amadornes.framez.compat.ic2;

import com.amadornes.framez.api.FramezApi;
import com.amadornes.framez.compat.CompatModule;
import com.amadornes.framez.compat.ic2.eu.MotorProviderEU;
import com.amadornes.framez.compat.ic2.eu.RenderSpecialEU;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CompatModuleIC2 extends CompatModule {

    @Override
    public void preInit(FMLPreInitializationEvent ev) {

        FramezApi.inst().getMotorRegistry().registerMotor(new MotorProviderEU());
        if (ev.getSide() == Side.CLIENT) {
            preInitClient();
        }
        FramezApi.inst().getMovementApi().registerMovementListener(new MovementListenerIC2());
    }

    @SideOnly(Side.CLIENT)
    private void preInitClient() {

        FramezApi.inst().getMotorRegistry().registerSpecialRenderer(new RenderSpecialEU());
    }

    @Override
    public void init(FMLInitializationEvent ev) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent ev) {

    }

    @Override
    public void registerBlocks() {

    }

    @Override
    public void registerItems() {

    }

    @Override
    public void registerRenders() {

    }

}