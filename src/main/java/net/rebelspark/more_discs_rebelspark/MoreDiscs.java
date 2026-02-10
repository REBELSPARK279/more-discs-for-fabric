package net.rebelspark.more_discs_rebelspark;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import net.rebelspark.more_discs_rebelspark.block.ModBlocks;
import net.rebelspark.more_discs_rebelspark.item.ModItemGroups;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.sound.ModSounds;
import net.rebelspark.more_discs_rebelspark.util.ModGlobalLootTableModifiers;
import net.rebelspark.more_discs_rebelspark.villager.ModVillagers;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MoreDiscs implements ModInitializer {
	public static final String MOD_ID = "more_discs_rebelspark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModGlobalLootTableModifiers.modifyLootTables();
		ModVillagers.registerVillagers();

		int[] commonPrices = {10, 9, 8};
		int[] uncommonPrices = {13, 11, 9};
		int[] rarePrices = {16, 14, 11};
		int[] exclusivePrices = {28, 24};
		int epicPrice = 32;

		int[] flintPrice = {1, 1, 2, 2, 2, 2, 3, 3};
		int[] flintAmount = {3, 4, 8, 7, 9, 8, 12, 13};

		ItemStack[] commonDiscs = {
				new ItemStack(ModItems.DEAD_VOXEL_MUSIC_DISC),
				new ItemStack(ModItems.DREITON_MUSIC_DISC),
				new ItemStack(ModItems.DROOPY_LIKES_RICOCHET_MUSIC_DISC),
				new ItemStack(ModItems.DROOPY_LIKES_YOUR_FACE_MUSIC_DISC),
				new ItemStack(ModItems.DRY_HANDS_MUSIC_DISC),
				new ItemStack(ModItems.EXCUSE_MUSIC_DISC),
				new ItemStack(ModItems.FLOATING_TREES_MUSIC_DISC),
				new ItemStack(ModItems.HAUNT_MUSKIE_MUSIC_DISC),
				new ItemStack(ModItems.HEADBUG_MUSIC_DISC),
				new ItemStack(ModItems.KEY_MUSIC_DISC),
				new ItemStack(ModItems.KI_MUSIC_DISC),
				new ItemStack(ModItems.SWEDEN_MUSIC_DISC)
		};

		ItemStack[] uncommonDiscs = {
				new ItemStack(ModItems.BLIND_SPOTS_MUSIC_DISC),
				new ItemStack(ModItems.DOOR_MUSIC_DISC),
				new ItemStack(ModItems.EQUINOXE_MUSIC_DISC),
				new ItemStack(ModItems.LIVING_MICE_MUSIC_DISC),
				new ItemStack(ModItems.MOOG_CITY_MUSIC_DISC),
				new ItemStack(ModItems.MUTATION_MUSIC_DISC),
				new ItemStack(ModItems.WENDING_MUSIC_DISC)
		};

		ItemStack[] rareDiscs = {
				new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC),
				new ItemStack(ModItems.BEGINNING2_MUSIC_DISC),
				new ItemStack(ModItems.CHRIS_MUSIC_DISC),
				new ItemStack(ModItems.CLARK_MUSIC_DISC),
				new ItemStack(ModItems.CONCRETE_HALLS_MUSIC_DISC),
				new ItemStack(ModItems.FLAKE_MUSIC_DISC),
				new ItemStack(ModItems.OXYGENE_MUSIC_DISC),
				new ItemStack(ModItems.STAND_TALL_MUSIC_DISC),
				new ItemStack(ModItems.SUBWOOFER_LULLABY_MUSIC_DISC),
				new ItemStack(ModItems.WET_HANDS_MUSIC_DISC)
		};

		ItemStack[] villExclusiveDiscs = {
				new ItemStack(ModItems.BACK_ON_DASH_MUSIC_DISC),
				new ItemStack(ModItems.DEATH_MUSIC_DISC),
				new ItemStack(ModItems.EXECUTIONER_MUSIC_DISC)
		};

		ItemStack[] epicDiscs = {
				new ItemStack(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC),
				new ItemStack(ModItems.AERIE_MUSIC_DISC),
				new ItemStack(ModItems.ALPHA_MUSIC_DISC),
				new ItemStack(ModItems.BALLAD_OF_THE_CATS_MUSIC_DISC),
				new ItemStack(ModItems.BIOME_FEST_MUSIC_DISC),
				new ItemStack(ModItems.FIREBUGS_MUSIC_DISC),
				new ItemStack(ModItems.FLOATING_DREAM_MUSIC_DISC),
				new ItemStack(ModItems.HAGGSTROM_MUSIC_DISC),
				new ItemStack(ModItems.ONE_MORE_DAY_MUSIC_DISC)
		};

		//1
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 1, factories -> {
			for (ItemStack disc : commonDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, commonPrices[0]), disc, 10, 4, 0.07f));
			}
			//for ()
			factories.add((world, entity, random) ->
					new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
		});

		//2
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 2, factories -> {
			for (ItemStack disc : commonDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, commonPrices[1]), disc, 10, 8, 0.07f));
			}
			for (ItemStack disc : uncommonDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, uncommonPrices[0]), disc, 10, 10, 0.07f));
			}
		});

		//3
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 3, factories -> {
			for (ItemStack disc : commonDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, commonPrices[2]), disc, 10, 12, 0.07f));
			}
			for (ItemStack disc : uncommonDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, uncommonPrices[1]), disc, 10, 15, 0.07f));
			}
			for (ItemStack disc : rareDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, rarePrices[0]), disc, 10, 18, 0.07f));
			}
		});

		//4
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 4, factories -> {
			for (ItemStack disc : uncommonDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, uncommonPrices[2]), disc, 10, 20, 0.07f));
			}
			for (ItemStack disc : rareDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, rarePrices[1]), disc, 10, 24, 0.07f));
			}
			for (ItemStack disc : villExclusiveDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, exclusivePrices[0]), disc, 10, 28, 0.07f));
			}
		});

		//5
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 5, factories -> {
			for (ItemStack disc : rareDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, rarePrices[2]), disc, 10, 30, 0.07f));
			}
			for (ItemStack disc : villExclusiveDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, exclusivePrices[1]), disc, 10, 35, 0.07f));
			}
			for (ItemStack disc : epicDiscs) {
				factories.add((world, entity, random) ->
						new TradeOffer(new TradedItem(Items.EMERALD, epicPrice), disc, 10, 40, 0.07f));
			}
		});

		//wandy-t

			/*
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "flint"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 2),
					new ItemStack(Items.FLINT, 8), 8, 4, 0.15f));

			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "dead_voxel"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.DEAD_VOXEL_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "dreiton"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.DREITON_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "dry_hands"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.DRY_HANDS_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "floating_trees"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.FLOATING_TREES_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "haunt_muskie"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.HAUNT_MUSKIE_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "headbug"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.HEADBUG_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "ki"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.KI_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "sweden"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.SWEDEN_MUSIC_DISC, 1), 3, 4, 0.25f));

			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "blind_spots"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.BLIND_SPOTS_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "door"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.DOOR_MUSIC_DISC, 1), 3,4,0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "excuse"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.EXCUSE_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "equinoxe"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.EQUINOXE_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "living_mice"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.LIVING_MICE_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "moog_city"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.MOOG_CITY_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "mutation"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.MUTATION_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "wending"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 14),
					new ItemStack(ModItems.WENDING_MUSIC_DISC, 1), 3, 4, 0.25f));

			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "aria_math"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "oxygene"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.OXYGENE_MUSIC_DISC, 1), 3, 4, 0.25f));

			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "castlemania2"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 52),
					new ItemStack(ModItems.CASTLEMANIA2_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "hardcoreminecraft"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 52),
					new ItemStack(ModItems.HARDCOREMINECRAFT_MUSIC_DISC, 1), 3, 4, 0.25f));

			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "beginning"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 46),
					new ItemStack(ModItems.BEGINNING_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "castlemania"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 46),
					new ItemStack(ModItems.CASTLEMANIA_MUSIC_DISC, 1), 3, 4, 0.25f));
			factories.addAll(Identifier.of(MoreDiscs.MOD_ID, "invincible"), (entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 46),
					new ItemStack(ModItems.INVINCIBLE_MUSIC_DISC, 1), 3, 4, 0.25f));

			 */
	}
}













