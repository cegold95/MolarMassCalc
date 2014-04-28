// periodic table
public class PerTable
{
	protected Element[] list;
	
	public PerTable()
	{
		list = new Element[117];
		list[0] = new Element("H", 1.008, 1);
		list[1] = new Element("HE", 4.0026, 2);
		list[2] = new Element("LI", 6.94, 3);
		list[3] = new Element("BE", 9.0122, 4);
		list[4] = new Element("B", 10.81, 5);
		list[5] = new Element("C", 12.011, 6);
		list[6] = new Element("N", 14.007, 7);
		list[7] = new Element("O", 15.999, 8);
		list[8] = new Element("F", 18.998, 9);
		list[9] = new Element("NE", 20.180, 10);
		list[10] = new Element("NA", 22.990, 11);
		list[11] = new Element("MG", 24.305, 12);
		list[12] = new Element("AL", 26.982, 13);
		list[13] = new Element("SI", 28.085, 14);
		list[14] = new Element("P", 30.974, 15);
		list[15] = new Element("S", 32.06, 16);
		list[16] = new Element("CL", 35.45, 17);
		list[17] = new Element("AR", 39.948, 18);
		list[18] = new Element("K", 39.098, 19);
		list[19] = new Element("CA", 40.078, 20);
		list[20] = new Element("SC", 44.956, 21);
		list[21] = new Element("TI", 47.867, 22);
		list[22] = new Element("V", 50.942, 23);
		list[23] = new Element("CR", 51.996, 24);
		list[24] = new Element("MN", 54.938, 25);
		list[25] = new Element("FE", 55.845, 26);
		list[26] = new Element("CO", 58.933, 27);
		list[27] = new Element("NI", 58.693, 28);
		list[28] = new Element("CU", 63.546, 29);
		list[29] = new Element("ZN", 65.38, 30);
		list[30] = new Element("GA", 69.723, 31);
		list[31] = new Element("GE", 72.63, 32);
		list[32] = new Element("AS", 74.933, 33);
		list[33] = new Element("SE", 78.96, 34);
		list[34] = new Element("BR", 79.904, 35);
		list[35] = new Element("KR", 83.798, 36);
		list[36] = new Element("RB", 85.468, 37);
		list[37] = new Element("SR", 87.62, 38);
		list[38] = new Element("Y", 88.906, 39);
		list[39] = new Element("ZR", 91.224, 40);
		list[40] = new Element("NB", 92.906, 41);
		list[41] = new Element("MO", 95.96, 42);
		list[42] = new Element("TC", 97.91, 43);
		list[43] = new Element("RU", 101.07, 44);
		list[44] = new Element("RH", 102.91, 45);
		list[45] = new Element("PD", 106.42, 46);
		list[46] = new Element("AG", 107.87, 47);
		list[47] = new Element("CD", 112.41, 48);
		list[48] = new Element("IN", 114.82, 49);
		list[49] = new Element("SN", 118.71, 50);
		list[50] = new Element("SB", 121.76, 51);
		list[51] = new Element("TE", 127.60, 52);
		list[52] = new Element("I", 126.90, 53);
		list[53] = new Element("XE", 131.29, 54);
		list[54] = new Element("CS", 132.91, 55);
		list[55] = new Element("BA", 137.33, 56);
		list[56] = new Element("LA", 138.91, 57);
		list[57] = new Element("CE", 140.12, 58);
		list[58] = new Element("PR", 140.91, 59);
		list[59] = new Element("ND", 144.24, 60);
		list[60] = new Element("PM", 144.91, 61);
		list[61] = new Element("SM", 150.36, 62);
		list[62] = new Element("EU", 151.96, 63);
		list[63] = new Element("GD", 157.25, 64);
		list[64] = new Element("TB", 158.93, 65);
		list[65] = new Element("DY", 162.50, 66);
		list[66] = new Element("HO", 164.93, 67);
		list[67] = new Element("ER", 167.26, 68);
		list[68] = new Element("TM", 168.93, 69);
		list[69] = new Element("YB", 173.05, 7);
		/*list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		list[7] = new Element(, 7);
		*/
	}
	
	public Element lookup(String search)
	{
		search = search.toUpperCase();
		for (int i = 0; i < list.length; i++)
		{
			if (list[i].getName().equals(search))
				return list[i];
		}
		return null;
	}
	
	public String getName(Element x)
	{
		return x.getName();
	}
	
	public int getNumber(Element x)
	{
		return x.getNumber();
	}
	
	public double getWeight(Element x)
	{
		return x.getWeight();
	}
}

