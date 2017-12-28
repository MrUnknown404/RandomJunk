package container;

import invtweaks.api.container.ChestContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import tileentity.TileEntityWoodCrate;

@ChestContainer(rowSize = 9, showButtons = true, isLargeChest = true)
public class ContainerWoodCrate extends Container {
	
	private TileEntityWoodCrate te;
	
	public ContainerWoodCrate(IInventory playerInv, TileEntityWoodCrate te) {
		this.te = te;
		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		this.addSlotToContainer(new SlotItemHandler(handler, 0, 8,        18));
		this.addSlotToContainer(new SlotItemHandler(handler, 1, 8+18,     18));
		this.addSlotToContainer(new SlotItemHandler(handler, 2, 8+(18*2), 18));
		this.addSlotToContainer(new SlotItemHandler(handler, 3, 8+(18*3), 18));
		this.addSlotToContainer(new SlotItemHandler(handler, 4, 8+(18*4), 18));
		this.addSlotToContainer(new SlotItemHandler(handler, 5, 8+(18*5), 18));
		this.addSlotToContainer(new SlotItemHandler(handler, 6, 8+(18*6), 18));
		this.addSlotToContainer(new SlotItemHandler(handler, 7, 8+(18*7), 18));
		this.addSlotToContainer(new SlotItemHandler(handler, 8, 8+(18*8), 18));
		
		this.addSlotToContainer(new SlotItemHandler(handler, 9,  8,        18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 10, 8+18,     18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 11, 8+(18*2), 18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 12, 8+(18*3), 18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 13, 8+(18*4), 18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 14, 8+(18*5), 18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 15, 8+(18*6), 18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 16, 8+(18*7), 18+18));
		this.addSlotToContainer(new SlotItemHandler(handler, 17, 8+(18*8), 18+18));
		
		this.addSlotToContainer(new SlotItemHandler(handler, 18, 8,        18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 19, 8+18,     18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 20, 8+(18*2), 18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 21, 8+(18*3), 18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 22, 8+(18*4), 18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 23, 8+(18*5), 18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 24, 8+(18*6), 18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 25, 8+(18*7), 18+(18*2)));
		this.addSlotToContainer(new SlotItemHandler(handler, 26, 8+(18*8), 18+(18*2)));
		
		this.addSlotToContainer(new SlotItemHandler(handler, 27, 8,        18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 28, 8+18,     18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 29, 8+(18*2), 18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 30, 8+(18*3), 18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 31, 8+(18*4), 18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 32, 8+(18*5), 18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 33, 8+(18*6), 18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 34, 8+(18*7), 18+(18*3)));
		this.addSlotToContainer(new SlotItemHandler(handler, 35, 8+(18*8), 18+(18*3)));
		
		this.addSlotToContainer(new SlotItemHandler(handler, 36, 8,        18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 37, 8+18,     18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 38, 8+(18*2), 18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 39, 8+(18*3), 18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 40, 8+(18*4), 18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 41, 8+(18*5), 18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 42, 8+(18*6), 18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 43, 8+(18*7), 18+(18*4)));
		this.addSlotToContainer(new SlotItemHandler(handler, 44, 8+(18*8), 18+(18*4)));
		
		this.addSlotToContainer(new SlotItemHandler(handler, 45, 8,        18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 46, 8+18,     18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 47, 8+(18*2), 18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 48, 8+(18*3), 18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 49, 8+(18*4), 18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 50, 8+(18*5), 18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 51, 8+(18*6), 18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 52, 8+(18*7), 18+(18*5)));
		this.addSlotToContainer(new SlotItemHandler(handler, 53, 8+(18*8), 18+(18*5)));
		
		int xPos = 8;
		int yPos = 140;
				
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
			}
		}
				
		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInv, x, xPos + x * 18, yPos + 58));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return !player.isSpectator();
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		ItemStack previous = ItemStack.EMPTY;
		Slot slot = (Slot) this.inventorySlots.get(fromSlot);

		if (slot != null && slot.getHasStack()) {
			ItemStack current = slot.getStack();
			previous = current.copy();

			if (fromSlot < handler.getSlots()) {
				if (!this.mergeItemStack(current, handler.getSlots(), handler.getSlots() + 36, true)) {
					return ItemStack.EMPTY;
				}
			} else {
				if (!this.mergeItemStack(current, 0, handler.getSlots(), false)) {
					return ItemStack.EMPTY;
				}
			}

		if (current.getCount() == 0) {
			slot.putStack(ItemStack.EMPTY);
			} else {
				slot.onSlotChanged();
			}
			if (current.getCount() == previous.getCount()) {
				return null;
			}
			slot.onTake(playerIn, current);
		}
		return previous;
	}
}
