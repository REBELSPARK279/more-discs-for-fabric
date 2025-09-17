package net.rebelspark.more_discs_rebelspark.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreDiscs.MOD_ID, "mod_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MICE_ON_VENUS_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.more_discs_rebelspark.mod_discs"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC);
                        entries.add(ModItems.ALPHA_MUSIC_DISC);
                        entries.add(ModItems.ARIA_MATH_MUSIC_DISC);
                        entries.add(ModItems.BACK_ON_DASH_MUSIC_DISC);
                        entries.add(ModItems.BEGINNING_MUSIC_DISC);
                        entries.add(ModItems.BEGINNING2_MUSIC_DISC);
                        entries.add(ModItems.BIOME_FEST_MUSIC_DISC);
                        entries.add(ModItems.BLIND_SPOTS_MUSIC_DISC);
                        entries.add(ModItems.CASTLEMANIA_MUSIC_DISC);
                        entries.add(ModItems.CASTLEMANIA2_MUSIC_DISC);
                        entries.add(ModItems.CHRIS_MUSIC_DISC);
                        entries.add(ModItems.CLARK_MUSIC_DISC);
                        entries.add(ModItems.CONCRETE_HALLS_MUSIC_DISC);
                        entries.add(ModItems.DANNY_MUSIC_DISC);
                        entries.add(ModItems.DEAD_VOXEL_MUSIC_DISC);
                        entries.add(ModItems.DEATH_MUSIC_DISC);
                        entries.add(ModItems.DOG_MUSIC_DISC);
                        entries.add(ModItems.DOOR_MUSIC_DISC);
                        entries.add(ModItems.DREITON_MUSIC_DISC);
                        entries.add(ModItems.DRY_HANDS_MUSIC_DISC);
                        entries.add(ModItems.EXCUSE_MUSIC_DISC);
                        entries.add(ModItems.EXECUTIONER_MUSIC_DISC);
                        entries.add(ModItems.EQUINOXE_MUSIC_DISC);
                        entries.add(ModItems.FLAKE_MUSIC_DISC);
                        entries.add(ModItems.FLOATING_TREES_MUSIC_DISC);
                        entries.add(ModItems.HAGGSTROM_MUSIC_DISC);
                        entries.add(ModItems.HARDCOREMINECRAFT_MUSIC_DISC);
                        entries.add(ModItems.HAUNT_MUSKIE_MUSIC_DISC);
                        entries.add(ModItems.HEADBUG_MUSIC_DISC);
                        entries.add(ModItems.INVINCIBLE_MUSIC_DISC);
                        entries.add(ModItems.KEY_MUSIC_DISC);
                        entries.add(ModItems.KI_MUSIC_DISC);
                        entries.add(ModItems.LIVING_MICE_MUSIC_DISC);
                        entries.add(ModItems.MICE_ON_VENUS_MUSIC_DISC);
                        entries.add(ModItems.MINECRAFT_MUSIC_DISC);
                        entries.add(ModItems.MOOG_CITY_MUSIC_DISC);
                        entries.add(ModItems.MOOG_CITY2_MUSIC_DISC);
                        entries.add(ModItems.MUTATION_MUSIC_DISC);
                        entries.add(ModItems.OXYGENE_MUSIC_DISC);
                        entries.add(ModItems.SUBWOOFER_LULLABY_MUSIC_DISC);
                        entries.add(ModItems.SWEDEN_MUSIC_DISC);
                        entries.add(ModItems.TASWELL_MUSIC_DISC);
                        entries.add(ModItems.THE_END_MUSIC_DISC);
                        entries.add(ModItems.WET_HANDS_MUSIC_DISC);
                        entries.add(ModItems.EMPTY_DISC_CORE);

                    }).build());

    public static final ItemGroup MOD_DISC_FRAGS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreDiscs.MOD_ID, "mod_disc_frags"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.THE_END_DISC_FRAGMENT))
                    .displayName(Text.translatable("itemgroup.more_discs_rebelspark.mod_disc_frags"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.DOG_DISC_FRAGMENT);
                        entries.add(ModItems.MINECRAFT_DISC_FRAGMENT);
                        entries.add(ModItems.MOOG_CITY2_DISC_FRAGMENT);
                        entries.add(ModItems.THE_END_DISC_FRAGMENT);

                    }).build());



    public static void registerItemGroups() {
        MoreDiscs.LOGGER.info("Creative mode tabs for " + MoreDiscs.MOD_ID + " are being registered!");
    }
}