package net.rebelspark.more_discs_rebelspark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                createShaped(RecipeCategory.MISC, ModItems.EMPTY_DISC_CORE)
                        .pattern(" R ")
                        .pattern("RIR")
                        .pattern(" R ")
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BLIND_SPOTS_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("ICI")
                        .pattern("FFF")
                        .input('F', Items.FLINT)
                        .input('I', Items.INK_SAC)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.DEAD_VOXEL_MUSIC_DISC)
                        .pattern("RLG")
                        .pattern("LCL")
                        .pattern("RLG")
                        .input('R', Items.REDSTONE)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('G', Items.GUNPOWDER)
                        .input('L', Items.REDSTONE_LAMP)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);
/*
ISOLATE
                createShaped(RecipeCategory.MISC, ModItems.DOOR_MUSIC_DISC)
                        .pattern("FDF")
                        .pattern("GCD")
                        .pattern("FDF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('G', Items.GOLD_NUGGET)
                        .input('D', Items.DARK_OAK_DOOR)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);
*/
                createShaped(RecipeCategory.MISC, ModItems.DREITON_MUSIC_DISC)
                        .pattern("FNF")
                        .pattern("NCN")
                        .pattern("FFF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('N', Items.NOTE_BLOCK)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.DRY_HANDS_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("SCS")
                        .pattern("FFF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('S', Items.SAND)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.EQUINOXE_MUSIC_DISC)
                        .pattern("SDI")
                        .pattern("DCP")
                        .pattern("GPE")
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('S', Items.GLOWSTONE)
                        .input('D', Items.GLOWSTONE_DUST)
                        .input('I', Items.IRON_NUGGET)
                        .input('G', Items.GOLD_NUGGET)
                        .input('P', Items.PHANTOM_MEMBRANE)
                        .input('E', Items.ENDER_PEARL)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.EXCUSE_MUSIC_DISC)
                        .pattern("FSF")
                        .pattern("LCL")
                        .pattern("FSF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('L', Items.LAPIS_LAZULI)
                        .input('S', Items.STRIPPED_DARK_OAK_WOOD)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.FLOATING_TREES_MUSIC_DISC)
                        .pattern("FLF")
                        .pattern("LCL")
                        .pattern("F F")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('L', Items.OAK_LEAVES)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.HAUNT_MUSKIE_MUSIC_DISC)
                        .pattern("FWF")
                        .pattern("WCW")
                        .pattern("FWF")
                        .input('F', Items.FLINT)
                        .input('W', Items.WHITE_WOOL)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.HEADBUG_MUSIC_DISC)
                        .pattern("FWF")
                        .pattern("OCO")
                        .pattern("FFF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('O', Items.CORNFLOWER)
                        .input('W', Items.WATER_BUCKET)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.KEY_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("FCT")
                        .pattern("FFF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('T', Items.TRIAL_KEY)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.KI_MUSIC_DISC)
                        .pattern("FLF")
                        .pattern("PCP")
                        .pattern("FLF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('L', Items.CHERRY_LEAVES)
                        .input('P', Items.PINK_PETALS)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.LIVING_MICE_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("GCG")
                        .pattern("FFF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('G', Items.GREEN_DYE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.MOOG_CITY_MUSIC_DISC)
                        .pattern("FAF")
                        .pattern("SCS")
                        .pattern("FAF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('A', Items.ALLIUM)
                        .input('S', Items.STONE_BRICKS)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.MUTATION_MUSIC_DISC)
                        .pattern("FYF")
                        .pattern("YCL")
                        .pattern("FLF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('Y', Items.YELLOW_DYE)
                        .input('L', Items.LIME_DYE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.SWEDEN_MUSIC_DISC)
                        .pattern("FBF")
                        .pattern("YCY")
                        .pattern("FBF")
                        .input('F', Items.FLINT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .input('B', Items.BLUE_DYE)
                        .input('Y', Items.YELLOW_DYE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModItems.DOG_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("FCF")
                        .pattern("FFF")
                        .input('F', ModItems.DOG_DISC_FRAGMENT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.MINECRAFT_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("FCF")
                        .pattern("FFF")
                        .input('F', ModItems.MINECRAFT_DISC_FRAGMENT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.MOOG_CITY2_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("FCF")
                        .pattern("FFF")
                        .input('F', ModItems.MOOG_CITY2_DISC_FRAGMENT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.THE_END_MUSIC_DISC)
                        .pattern("FFF")
                        .pattern("FCF")
                        .pattern("FFF")
                        .input('F', ModItems.THE_END_DISC_FRAGMENT)
                        .input('C', ModItems.EMPTY_DISC_CORE)
                        .criterion(hasItem(ModItems.EMPTY_DISC_CORE), conditionsFromItem(ModItems.EMPTY_DISC_CORE))
                        .offerTo(exporter);



            }
        };
    }


    @Override
    public String getName() {
        return "MoreDiscs Recipes";
    }
}
