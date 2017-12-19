package com.mrunknown404.randomjunk.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum CompBlockTypes implements IStringSerializable {
		COMPRESSED_X1("compressed_x1",0),
		COMPRESSED_X2("compressed_x2",1),
		COMPRESSED_X3("compressed_x3",2),
		COMPRESSED_X4("compressed_x4",3),
		COMPRESSED_X5("compressed_x5",4),
		COMPRESSED_X6("compressed_x6",5),
		COMPRESSED_X7("compressed_x7",6),
		COMPRESSED_X8("compressed_x8",7),
		COMPRESSED_X9("compressed_x9",8),
		COMPRESSED_X10("compressed_x10",9),
		COMPRESSED_X11("compressed_x11",10),
		COMPRESSED_X12("compressed_x12",11);
		
		private int ID;
		private String name;
		
		private CompBlockTypes(String name, int ID) {
			this.ID = ID;
			this.name= name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
}
