package net.rebelspark.more_discs_rebelspark.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModGlobalLootTableModifiers {
    private static final Identifier DES_TEMP = Identifier.of("minecraft", "chests/desert_pyramid");
    private static final Identifier IGLOO = Identifier.of("minecraft", "chests/igloo_chest");
    private static final Identifier BASTION_OTHER = Identifier.of("minecraft", "chests/bastion_other");
    private static final Identifier BLAZE = Identifier.of("minecraft", "entities/blaze");
    private static final Identifier MAGMA_CUBE = Identifier.of("minecraft", "entities/magma_cube");
    private static final Identifier MOOSHROOM = Identifier.of("minecraft", "entities/mooshroom");
    private static final Identifier MANSION = Identifier.of("minecraft", "chests/woodland_mansion");
    private static final Identifier FISH_TREASURE = Identifier.of("minecraft", "gameplay/fishing/treasure");
    private static final Identifier CHORUS_PLANT = Identifier.of("minecraft", "blocks/chorus_plant");
    private static final Identifier ICE = Identifier.of("minecraft", "blocks/ice");
    private static final Identifier STRAY = Identifier.of("minecraft", "entities/stray");
    private static final Identifier SHEEP_YELLOW = Identifier.of("minecraft", "entities/sheep/yellow");
    private static final Identifier FORT = Identifier.of("minecraft", "chests/nether_bridge");
    private static final Identifier ANCIENT_CITY = Identifier.of("minecraft", "chests/ancient_city");
    private static final Identifier STRONG_XING = Identifier.of("minecraft", "chests/stronghold_crossing");
    private static final Identifier END_CITY_TREASURE = Identifier.of("minecraft", "chests/end_city/treasure");
    private static final Identifier SKELETON = Identifier.of("minecraft", "entities/skeleton");
    private static final Identifier SPAWNERS = Identifier.of("minecraft", "chests/simple_dungeon");
    private static final Identifier ARCH_DES_WELL = Identifier.of("minecraft", "archeology/desert_well");
    private static final Identifier ARCH_DES_TEMP = Identifier.of("minecraft", "archeology/desert_pyramid");
    private static final Identifier VILLAGE_FISH = Identifier.of("minecraft", "chests/village/village_fisher");
    private static final Identifier CHERRY_LEAVES = Identifier.of("minecraft", "blocks/cherry_leaves");
    private static final Identifier JUNG_TEMP = Identifier.of("minecraft", "chests/jungle_temple");
    private static final Identifier TREASURE = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier RUIN_PORT = Identifier.of("minecraft", "chests/ruined_portal");
    private static final Identifier MINESHAFT = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier GRASS_BLOCK = Identifier.of("minecraft", "blocks/grass_block");
    private static final Identifier STONE = Identifier.of("minecraft", "blocks/stone");
    private static final Identifier IRON_GOLEM = Identifier.of("minecraft", "entities/iron_golem");
    private static final Identifier SHEEP_PINK = Identifier.of("minecraft", "entities/sheep/pink");
    private static final Identifier DRAGON = Identifier.of("minecraft", "entities/ender_dragon");
    private static final Identifier SEA_LANTERN = Identifier.of("minecraft", "blocks/sea_lantern");
    private static final Identifier POT_TRIAL_CHAMBER = Identifier.of("minecraft", "pots/trial_chambers/corridor");
    private static final Identifier SHULKER = Identifier.of("minecraft", "entities/shulker");
    private static final Identifier ZOMBIE = Identifier.of("minecraft", "entities/zombie");
    private static final Identifier SPIDER = Identifier.of("minecraft", "entities/spider");
    private static final Identifier CREEPER = Identifier.of("minecraft", "entities/creeper");
    private static final Identifier SHIPWRECK_TREASURE = Identifier.of("minecraft", "chests/shipwreck_treasure");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            //A FAM ROOM

            if(DES_TEMP.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0625f))
                        .with(ItemEntry.builder(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(IGLOO.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0975f))
                    .with(ItemEntry.builder(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_OTHER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.12f))
                    .with(ItemEntry.builder(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //ALPHA

            if(ZOMBIE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.02f))
                    .with(ItemEntry.builder(ModItems.ALPHA_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(CREEPER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.02f))
                    .with(ItemEntry.builder(ModItems.ALPHA_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(SKELETON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.02f))
                    .with(ItemEntry.builder(ModItems.ALPHA_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(SPIDER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.02f))
                    .with(ItemEntry.builder(ModItems.ALPHA_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //ARIA MATH

            if(BLAZE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.023f))
                    .with(ItemEntry.builder(ModItems.ARIA_MATH_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(MAGMA_CUBE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.01f))
                    .with(ItemEntry.builder(ModItems.ARIA_MATH_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //BIOME FEST

            if(MOOSHROOM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.015f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(MANSION.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.165f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(FISH_TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.03f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(POT_TRIAL_CHAMBER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.025f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //BEGINNING 2

            if(CHORUS_PLANT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.002f))
                    .with(ItemEntry.builder(ModItems.BEGINNING2_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //CHRIS

            if(IGLOO.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.28f))
                    .with(ItemEntry.builder(ModItems.CHRIS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(ICE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.008f))
                    .with(ItemEntry.builder(ModItems.CHRIS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(STRAY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.026f))
                    .with(ItemEntry.builder(ModItems.CHRIS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //CLARK

            if(SHEEP_YELLOW.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.03f))
                    .with(ItemEntry.builder(ModItems.CLARK_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(FORT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.15f))
                    .with(ItemEntry.builder(ModItems.CLARK_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //CONCRETE HALLS

            if(MINESHAFT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.175f))
                    .with(ItemEntry.builder(ModItems.CONCRETE_HALLS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_OTHER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.225f))
                    .with(ItemEntry.builder(ModItems.CONCRETE_HALLS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //DANNY

            if(ANCIENT_CITY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.012f))
                    .with(ItemEntry.builder(ModItems.DANNY_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(STRONG_XING.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0052f))
                    .with(ItemEntry.builder(ModItems.DANNY_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.015f))
                    .with(ItemEntry.builder(ModItems.DANNY_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //DOG

            if(MANSION.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0279f))
                    .with(ItemEntry.builder(ModItems.DOG_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(SKELETON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.01f))
                    .with(ItemEntry.builder(ModItems.DOG_DISC_FRAGMENT))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(SPAWNERS.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.035f))
                    .with(ItemEntry.builder(ModItems.DOG_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //FLAKE

            if(ARCH_DES_WELL.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.1f))
                    .with(ItemEntry.builder(ModItems.FLAKE_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(ARCH_DES_TEMP.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.1f))
                    .with(ItemEntry.builder(ModItems.FLAKE_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //HAGGSTROM

            if(VILLAGE_FISH.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.125f))
                    .with(ItemEntry.builder(ModItems.HAGGSTROM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(CHERRY_LEAVES.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.00075f))
                    .with(ItemEntry.builder(ModItems.HAGGSTROM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(JUNG_TEMP.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0562f))
                    .with(ItemEntry.builder(ModItems.HAGGSTROM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //MICE ON VENUS

            if(ARCH_DES_TEMP.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.035f))
                    .with(ItemEntry.builder(ModItems.MICE_ON_VENUS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(ARCH_DES_WELL.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.042f))
                    .with(ItemEntry.builder(ModItems.MICE_ON_VENUS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.025f))
                    .with(ItemEntry.builder(ModItems.MICE_ON_VENUS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(RUIN_PORT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.03f))
                    .with(ItemEntry.builder(ModItems.MICE_ON_VENUS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //MINECRAFT

            if(GRASS_BLOCK.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.00075f))
                    .with(ItemEntry.builder(ModItems.MINECRAFT_DISC_FRAGMENT))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //MOOG CITY 2

            if(ANCIENT_CITY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.012f))
                    .with(ItemEntry.builder(ModItems.MOOG_CITY2_DISC_FRAGMENT))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(STONE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.00065f))
                    .with(ItemEntry.builder(ModItems.MOOG_CITY2_DISC_FRAGMENT))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(IRON_GOLEM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0047f))
                    .with(ItemEntry.builder(ModItems.MOOG_CITY2_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //OXYGENE

            if(TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.225f))
                    .with(ItemEntry.builder(ModItems.OXYGENE_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(SHIPWRECK_TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.33f))
                    .with(ItemEntry.builder(ModItems.OXYGENE_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //SUBWOOFER LULLABY

            if(SHEEP_PINK.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.03f))
                    .with(ItemEntry.builder(ModItems.SUBWOOFER_LULLABY_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //TASWELL

            if(DRAGON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1.0f))
                    .with(ItemEntry.builder(ModItems.TASWELL_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //THE END

            if(DRAGON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.025f))
                    .with(ItemEntry.builder(ModItems.THE_END_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());

            }

            if(SHULKER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.005f))
                    .with(ItemEntry.builder(ModItems.THE_END_DISC_FRAGMENT))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //WET HANDS

            if(SEA_LANTERN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.027f))
                    .with(ItemEntry.builder(ModItems.WET_HANDS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(FISH_TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.046f))
                    .with(ItemEntry.builder(ModItems.WET_HANDS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}