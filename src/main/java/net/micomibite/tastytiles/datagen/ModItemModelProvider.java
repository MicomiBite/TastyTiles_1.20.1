package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.micomibite.tastytiles.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TastyTiles.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CERAMIC_MIXTURE);

        evenSimplerBlockItem(ModBlocks.BRICK_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.BRICK_PITTER_TILE_WALL, ModBlocks.BRICK_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.FIRE_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.FIRE_PITTER_TILE_WALL, ModBlocks.FIRE_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.OCHRE_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.OCHRE_PITTER_TILE_WALL, ModBlocks.OCHRE_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.EARTHY_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.EARTHY_PITTER_TILE_WALL, ModBlocks.EARTHY_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.PALE_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.PALE_PITTER_TILE_WALL, ModBlocks.PALE_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.LUSH_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.LUSH_PITTER_TILE_WALL, ModBlocks.LUSH_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.DEEP_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.DEEP_PITTER_TILE_WALL, ModBlocks.DEEP_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.PITCH_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.PITCH_PITTER_TILE_WALL, ModBlocks.PITCH_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.PINK_PITTER_TILE_WALL, ModBlocks.PINK_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_SUMMER_TILE_WALL, ModBlocks.EVE_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_SPROUT_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_SPROUT_SUMMER_TILE_WALL, ModBlocks.EVE_SPROUT_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_BLOOM_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_BLOOM_SUMMER_TILE_WALL, ModBlocks.EVE_BLOOM_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_FLOWER_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_FLOWER_SUMMER_TILE_WALL, ModBlocks.EVE_FLOWER_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_CROSS_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_CROSS_SUMMER_TILE_WALL, ModBlocks.EVE_CROSS_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_RIDGE_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_RIDGE_SUMMER_TILE_WALL, ModBlocks.EVE_RIDGE_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_LINED_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_LINED_SUMMER_TILE_WALL, ModBlocks.EVE_LINED_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_SUMMER_TILE_WALL, ModBlocks.DAY_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_SPROUT_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_SPROUT_SUMMER_TILE_WALL, ModBlocks.DAY_SPROUT_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_BLOOM_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_BLOOM_SUMMER_TILE_WALL, ModBlocks.DAY_BLOOM_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_FLOWER_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_FLOWER_SUMMER_TILE_WALL, ModBlocks.DAY_FLOWER_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_CROSS_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_CROSS_SUMMER_TILE_WALL, ModBlocks.DAY_CROSS_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_RIDGE_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_RIDGE_SUMMER_TILE_WALL, ModBlocks.DAY_RIDGE_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_LINED_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_LINED_SUMMER_TILE_WALL, ModBlocks.DAY_LINED_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.LIGHT_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.LIGHT_PRETTI_TILE_WALL, ModBlocks.LIGHT_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.LIGHT_ROSY_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.LIGHT_ROSY_PRETTI_TILE_WALL, ModBlocks.LIGHT_ROSY_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.LIGHT_POSY_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.LIGHT_POSY_PRETTI_TILE_WALL, ModBlocks.LIGHT_POSY_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.LIGHT_RING_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.LIGHT_RING_PRETTI_TILE_WALL, ModBlocks.LIGHT_RING_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.LIGHT_SQUARED_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.LIGHT_SQUARED_PRETTI_TILE_WALL, ModBlocks.LIGHT_SQUARED_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.LIGHT_FULL_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.LIGHT_FULL_PRETTI_TILE_WALL, ModBlocks.LIGHT_FULL_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.DARK_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.DARK_PRETTI_TILE_WALL, ModBlocks.DARK_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.DARK_ROSY_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.DARK_ROSY_PRETTI_TILE_WALL, ModBlocks.DARK_ROSY_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.DARK_POSY_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.DARK_POSY_PRETTI_TILE_WALL, ModBlocks.DARK_POSY_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.DARK_RING_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.DARK_RING_PRETTI_TILE_WALL, ModBlocks.DARK_RING_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.DARK_SQUARED_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.DARK_SQUARED_PRETTI_TILE_WALL, ModBlocks.DARK_SQUARED_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.DARK_FULL_PRETTI_TILE_STAIRS);
        wallItem(ModBlocks.DARK_FULL_PRETTI_TILE_WALL, ModBlocks.DARK_FULL_PRETTI_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_ORANGE_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_ORANGE_TILE_WALL, ModBlocks.CRISP_ORANGE_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_ORANGE_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_ORANGE_TILE_WALL, ModBlocks.CRISP_RIPE_ORANGE_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_LEMON_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_LEMON_TILE_WALL, ModBlocks.CRISP_LEMON_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_LEMON_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_LEMON_TILE_WALL, ModBlocks.CRISP_RIPE_LEMON_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_LIME_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_LIME_TILE_WALL, ModBlocks.CRISP_LIME_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_LIME_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_LIME_TILE_WALL, ModBlocks.CRISP_RIPE_LIME_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_BLUEBERRY_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_BLUEBERRY_TILE_WALL, ModBlocks.CRISP_BLUEBERRY_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_WALL, ModBlocks.CRISP_RIPE_BLUEBERRY_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_GRAPE_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_GRAPE_TILE_WALL, ModBlocks.CRISP_GRAPE_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_GRAPE_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_GRAPE_TILE_WALL, ModBlocks.CRISP_RIPE_GRAPE_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_PEACH_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_PEACH_TILE_WALL, ModBlocks.CRISP_PEACH_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_PEACH_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_PEACH_TILE_WALL, ModBlocks.CRISP_RIPE_PEACH_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_CLEAR_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_CLEAR_TILE_WALL, ModBlocks.CRISP_CLEAR_TILE);
        evenSimplerBlockItem(ModBlocks.CRISP_RIPE_CLEAR_TILE_STAIRS);
        wallItem(ModBlocks.CRISP_RIPE_CLEAR_TILE_WALL, ModBlocks.CRISP_RIPE_CLEAR_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_RED_TILE_STAIRS);
        wallItem(ModBlocks.GRID_RED_TILE_WALL, ModBlocks.GRID_RED_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_PURPLE_TILE_STAIRS);
        wallItem(ModBlocks.GRID_PURPLE_TILE_WALL, ModBlocks.GRID_PURPLE_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_TEAL_TILE_STAIRS);
        wallItem(ModBlocks.GRID_TEAL_TILE_WALL, ModBlocks.GRID_TEAL_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_POOL_TILE_STAIRS);
        wallItem(ModBlocks.GRID_POOL_TILE_WALL, ModBlocks.GRID_POOL_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_SAGE_TILE_STAIRS);
        wallItem(ModBlocks.GRID_SAGE_TILE_WALL, ModBlocks.GRID_SAGE_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_MIXED_TILE_STAIRS);
        wallItem(ModBlocks.GRID_MIXED_TILE_WALL, ModBlocks.GRID_MIXED_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_WHITE_TILE_STAIRS);
        wallItem(ModBlocks.GRID_WHITE_TILE_WALL, ModBlocks.GRID_WHITE_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_BLACK_TILE_STAIRS);
        wallItem(ModBlocks.GRID_BLACK_TILE_WALL, ModBlocks.GRID_BLACK_TILE);
        evenSimplerBlockItem(ModBlocks.GRID_SEWER_TILE_STAIRS);
        wallItem(ModBlocks.GRID_SEWER_TILE_WALL, ModBlocks.GRID_SEWER_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_SPRING_TILE_STAIRS);
        wallItem(ModBlocks.PINK_SPRING_TILE_WALL, ModBlocks.PINK_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_VINE_SPRING_TILE_STAIRS);
        wallItem(ModBlocks.PINK_VINE_SPRING_TILE_WALL, ModBlocks.PINK_VINE_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_SPROUT_SPRING_TILE_STAIRS);
        wallSixItem(ModBlocks.PINK_SPROUT_SPRING_TILE_WALL, ModBlocks.PINK_SPROUT_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_BLOOM_SPRING_TILE_STAIRS);
        wallSixItem(ModBlocks.PINK_BLOOM_SPRING_TILE_WALL, ModBlocks.PINK_BLOOM_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_CORNER_SPRING_TILE_STAIRS);
        wallItem(ModBlocks.PINK_CORNER_SPRING_TILE_WALL, ModBlocks.PINK_CORNER_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_FLOWER_SPRING_TILE_STAIRS);
        wallSixItem(ModBlocks.PINK_FLOWER_SPRING_TILE_WALL, ModBlocks.PINK_FLOWER_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.YELLOW_SPRING_TILE_STAIRS);
        wallItem(ModBlocks.YELLOW_SPRING_TILE_WALL, ModBlocks.YELLOW_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.YELLOW_VINE_SPRING_TILE_STAIRS);
        wallItem(ModBlocks.YELLOW_VINE_SPRING_TILE_WALL, ModBlocks.YELLOW_VINE_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.YELLOW_SPROUT_SPRING_TILE_STAIRS);
        wallSixItem(ModBlocks.YELLOW_SPROUT_SPRING_TILE_WALL, ModBlocks.YELLOW_SPROUT_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.YELLOW_BLOOM_SPRING_TILE_STAIRS);
        wallSixItem(ModBlocks.YELLOW_BLOOM_SPRING_TILE_WALL, ModBlocks.YELLOW_BLOOM_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.YELLOW_CORNER_SPRING_TILE_STAIRS);
        wallItem(ModBlocks.YELLOW_CORNER_SPRING_TILE_WALL, ModBlocks.YELLOW_CORNER_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.YELLOW_FLOWER_SPRING_TILE_STAIRS);
        wallSixItem(ModBlocks.YELLOW_FLOWER_SPRING_TILE_WALL, ModBlocks.YELLOW_FLOWER_SPRING_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_TILE_WALL, ModBlocks.CHOCO_CUT_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_SPLIT_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_SPLIT_TILE_WALL, ModBlocks.CHOCO_CUT_SPLIT_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_DIAMOND_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_DIAMOND_TILE_WALL, ModBlocks.CHOCO_CUT_DIAMOND_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_HEART_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_HEART_TILE_WALL, ModBlocks.CHOCO_CUT_HEART_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_CIRCLE_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_CIRCLE_TILE_WALL, ModBlocks.CHOCO_CUT_CIRCLE_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_TRIANGLE_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_TRIANGLE_TILE_WALL, ModBlocks.CHOCO_CUT_TRIANGLE_TILE);
        evenSimplerBlockItem(ModBlocks.CHOCO_CUT_SQUARE_TILE_STAIRS);
        wallSixItem(ModBlocks.CHOCO_CUT_SQUARE_TILE_WALL, ModBlocks.CHOCO_CUT_SQUARE_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_TILE_WALL, ModBlocks.VERDANT_CUT_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_SPLIT_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_SPLIT_TILE_WALL, ModBlocks.VERDANT_CUT_SPLIT_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_DIAMOND_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_DIAMOND_TILE_WALL, ModBlocks.VERDANT_CUT_DIAMOND_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_HEART_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_HEART_TILE_WALL, ModBlocks.VERDANT_CUT_HEART_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_CIRCLE_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_CIRCLE_TILE_WALL, ModBlocks.VERDANT_CUT_CIRCLE_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_TRIANGLE_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_TRIANGLE_TILE_WALL, ModBlocks.VERDANT_CUT_TRIANGLE_TILE);
        evenSimplerBlockItem(ModBlocks.VERDANT_CUT_SQUARE_TILE_STAIRS);
        wallSixItem(ModBlocks.VERDANT_CUT_SQUARE_TILE_WALL, ModBlocks.VERDANT_CUT_SQUARE_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_TILE_WALL, ModBlocks.JET_CUT_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_SPLIT_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_SPLIT_TILE_WALL, ModBlocks.JET_CUT_SPLIT_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_DIAMOND_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_DIAMOND_TILE_WALL, ModBlocks.JET_CUT_DIAMOND_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_HEART_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_HEART_TILE_WALL, ModBlocks.JET_CUT_HEART_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_CIRCLE_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_CIRCLE_TILE_WALL, ModBlocks.JET_CUT_CIRCLE_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_TRIANGLE_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_TRIANGLE_TILE_WALL, ModBlocks.JET_CUT_TRIANGLE_TILE);
        evenSimplerBlockItem(ModBlocks.JET_CUT_SQUARE_TILE_STAIRS);
        wallSixItem(ModBlocks.JET_CUT_SQUARE_TILE_WALL, ModBlocks.JET_CUT_SQUARE_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_TILE_WALL, ModBlocks.WHITE_AZULEJO_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_FLORAL_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_FLORAL_TILE_WALL, ModBlocks.WHITE_AZULEJO_FLORAL_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_REFINED_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_REFINED_TILE_WALL, ModBlocks.WHITE_AZULEJO_REFINED_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_SQUARED_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_SQUARED_TILE_WALL, ModBlocks.WHITE_AZULEJO_SQUARED_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_FISHY_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_FISHY_TILE_WALL, ModBlocks.WHITE_AZULEJO_FISHY_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_SHELL_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_SHELL_TILE_WALL, ModBlocks.WHITE_AZULEJO_SHELL_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_CROSS_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_CROSS_TILE_WALL, ModBlocks.WHITE_AZULEJO_CROSS_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_DIAMOND_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_DIAMOND_TILE_WALL, ModBlocks.WHITE_AZULEJO_DIAMOND_TILE);
        evenSimplerBlockItem(ModBlocks.WHITE_AZULEJO_LINED_TILE_STAIRS);
        wallItem(ModBlocks.WHITE_AZULEJO_LINED_TILE_WALL, ModBlocks.WHITE_AZULEJO_LINED_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_TILE_WALL, ModBlocks.BLUE_AZULEJO_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_FLORAL_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_FLORAL_TILE_WALL, ModBlocks.BLUE_AZULEJO_FLORAL_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_REFINED_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_REFINED_TILE_WALL, ModBlocks.BLUE_AZULEJO_REFINED_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_SQUARED_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_SQUARED_TILE_WALL, ModBlocks.BLUE_AZULEJO_SQUARED_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_FISHY_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_FISHY_TILE_WALL, ModBlocks.BLUE_AZULEJO_FISHY_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_SHELL_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_SHELL_TILE_WALL, ModBlocks.BLUE_AZULEJO_SHELL_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_CROSS_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_CROSS_TILE_WALL, ModBlocks.BLUE_AZULEJO_CROSS_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_DIAMOND_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_DIAMOND_TILE_WALL, ModBlocks.BLUE_AZULEJO_DIAMOND_TILE);
        evenSimplerBlockItem(ModBlocks.BLUE_AZULEJO_LINED_TILE_STAIRS);
        wallItem(ModBlocks.BLUE_AZULEJO_LINED_TILE_WALL, ModBlocks.BLUE_AZULEJO_LINED_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_TILE_STAIRS);
        wallSixItem(ModBlocks.SANDY_TILE_WALL, ModBlocks.SANDY_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_MOROCCAN_TILE_STAIRS);
        wallSixItem(ModBlocks.SANDY_MOROCCAN_TILE_WALL, ModBlocks.SANDY_MOROCCAN_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_SQUARED_TILE_STAIRS);
        wallSixItem(ModBlocks.SANDY_SQUARED_TILE_WALL, ModBlocks.SANDY_SQUARED_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_RING_TILE_STAIRS);
        wallSixItem(ModBlocks.SANDY_RING_TILE_WALL, ModBlocks.SANDY_RING_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_LINED_TILE_STAIRS);
        wallItem(ModBlocks.SANDY_LINED_TILE_WALL, ModBlocks.SANDY_LINED_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_STRIKE_TILE_STAIRS);
        wallItem(ModBlocks.SANDY_STRIKE_TILE_WALL, ModBlocks.SANDY_STRIKE_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_WAVE_TILE_STAIRS);
        wallSixItem(ModBlocks.SANDY_WAVE_TILE_WALL, ModBlocks.SANDY_WAVE_TILE);
        evenSimplerBlockItem(ModBlocks.SANDY_SHELL_TILE_STAIRS);
        wallSixItem(ModBlocks.SANDY_SHELL_TILE_WALL, ModBlocks.SANDY_SHELL_TILE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TastyTiles.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(TastyTiles.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TastyTiles.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallSixItem(RegistryObject<Block> block, RegistryObject<ModBlockStateProvider.SixDirectionBlock> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TastyTiles.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
}
