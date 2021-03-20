package com.simplilearn.mavenproject;

public class parkTable 
{
	park[] parkTable = new park[57];
	
	public parkTable()
	{
		System.out.println("CREATING TABLE");
		//1. Acadia = acad, maine
		parkTable[0] = new park("Acadia","acad","Maine",44.33503,-68.28644);
		//2. Arches = arch, utah 
		parkTable[1] = new park("Arches","arch","Utah",38.72193,-109.58853);
		//3. badlands = badl, sd
		parkTable[2] = new park("Badlands","badl","South Dakota",43.87230,-102.34412);
		//4. big bend = bibe, tx
		parkTable[3] = new park("Big Bend","bibe","Texas",29.4445,-104.03511);
		//5. biscayne = bisc , fl 
		parkTable[4] = new park("Biscayne","bisc","Florida",25.47624,-80.18117);
		//6. black canyon = blca , co
		parkTable[5] = new park("Black Canyon","blca","Colorado",38.56887160954031, -107.73380847666495);
		//7. bryce canyon = brca, ut
		parkTable[6] = new park("Bryce Canyon","brca","Utah",37.591551425012916, -112.2030685218957);
		//8. canyonlands = cany, ut
		parkTable[7] = new park("Canyonlands","cany","Utah",38.21052223488255, -109.90622482026849);
		//9. capitol reef = care, ut
		parkTable[8] = new park("Capitol Reef","care","Utah",38.08470359124842, -111.18468360280409);
		//10. channel islands = chis, ca
		parkTable[9] = new park("Channel Islands","chis","California",33.99994620026743, -119.78782003874561);
		//11. congaree - cong , sc
		parkTable[10] = new park("Congaree","cong","South Carolina",33.78951874927763, -80.76676123984487);
		//12. cuyahoga valley = cuva, oh
		parkTable[11] = new park("Cuyahoga Valley","cuva","Ohio",41.27683471134294, -81.55706416114582);
		//13. death valley = deva , ca
		parkTable[12] = new park("Death Valley","deva","California",36.497441961693944, -117.10686838082927);
		//14. denali = dena, ak 
		parkTable[13] = new park("Denali","dena","Alaska",63.06384601247618, -151.0048714490714);
		//15. dry tortugas = drto, fl 
		parkTable[14] = new park("Dry Tortugas","drto","Florida",24.628697172638862, -82.87301021425117);
		//16. everglades = ever, fl 
		parkTable[15] = new park("Everglades","ever","Florida",25.2645465746135, -80.82347834629239);
		//17. gates of the arctic = gaar, ak
		parkTable[16] = new park("Gates of the Arctic","gaar","Alaska",68.03483559490377, -153.12492892031614);
		//18. glacier bay  = glba, ak 
		parkTable[17] = new park("Glacier Bay","glba","Alaska",58.70578681634027, -137.03638610398386);
		//19. glacier  = glac, montana
		parkTable[18] = new park("Glacier","glac","Montana",48.73812855265165, -113.77487293664103);
		//20. grand canyon = grca, arizona
		parkTable[19] = new park("Grand Canyon","grca","Arizona",36.07159946651911, -112.06542667128181);
		//21. grand tetono = grte, wyoming
		parkTable[20] = new park("Grand Teton","grte","Wyoming",43.77855713719801, -110.65842866486186);
		//22. great basin = grba, nv 
		parkTable[21] = new park("Great Basin","grba","Nevada",38.92337791414113, -114.2455655185436);
		//23. great sand dunes = grsa, colorado 
		parkTable[22] = new park("Great Sand Dunes","grsa","Colorado",37.734267025857754, -105.63955005598577);
		//24. great smokey mountains = grsm, tn 
		parkTable[23] = new park("Great Smoky Mountains","grsm","Tennessee",35.62505155804556, -83.28467540748076);
		//25. guadalupe mountains = gumo, tx 
		parkTable[24] = new park("Guadalupe Mountains","gumo","Texas",31.92123703671203, -104.85001659424347);
		//26. haleakala = hale, hawaii
		parkTable[25] = new park("Haleakala","hale","Hawaii",20.72092699233575, -156.1595965819349);
		//27. Hawaii volcanoes = havo, hawaii
		parkTable[26] = new park("Hawaii Volcanoes","havo","Hawaii",19.38365567847243, -155.20017682898916);
		//28. hot springs = hosp, arkansas
		parkTable[27] = new park("Hot Springs","hosp","Arkansas",34.52277718858344, -93.03839911790271);
		//29. indiana dune = indu, indiana
		parkTable[28] = new park("Indiana Dunes","indu","Indiana",41.650525395661276, -87.07073417124282);
		//30. isle royale = isro, mi
		parkTable[29] = new park("Isle Royale","isro","Michigan",47.97993159332965, -88.63698190600601);
		//31. joshua tree = jotr, ca
		parkTable[30] = new park("Joshua Tree","jotr","California",33.844756918007555, -115.93819122963376);
		//32. katmai = katm, ak 
		parkTable[31] = new park("Katmai","katm","Alaska",58.68431440036909, -154.87665362067668);
		//33. kenai fjords = kefj, ak
		parkTable[32] = new park("Kenai Fjords","kefj","Alaska",59.846439211642355, -150.15958632537726);
		//??. kings canyon, ca
		//34. kobuk valley = kova, ak
		parkTable[33] = new park("Kobuk Valley","kova","Alaska",67.30003212665466, -159.0593375490105);
		//35. lake clark = lacl, ak
		parkTable[34] = new park("Lake Clark","lacl","Alaska",61.18693529363983, -153.47391582819498);
		//36. lassen volcanic = lavo, ca
		parkTable[35] = new park("Lassen Volcanic","lavo","California",40.494537135260316, -121.42123669102806);
		//37. mammoth cave = maca, ca
		parkTable[36] = new park("Mammoth Cave","maca","Kentucky",37.19833685080831, -86.11728553786915);
		//38. mesa verde = meve, co
		parkTable[37] = new park("Mesa Verde","meve","Colorado",37.23269225497078, -108.45999959608805);
		//39. mount rainier = mora, wa 
		parkTable[38] = new park("Mount Rainier","mora","Washington",46.875646448029926, -121.73701469515889);
		//40. new river gorge = neri, wv
		parkTable[39] = new park("New River Gorge","neri","West Virginia",37.87920924342221, -81.016236683298);
		//41. north cascades = noca, wa
		parkTable[40] = new park("North Cascades","noca","Washington",48.76983758292409, -121.2285382296541);
		//42. olympic = olym, wa
		parkTable[41] = new park("Olympic","olym","Washington",47.87138470572598, -123.3774744202639);
		//43. petrified forest = pefo, az
		parkTable[42] = new park("Petrified Forest","pefo","Arizona",35.001064024350214, -109.79404441386191);
		//44. pinnacles = pinn, ca
		parkTable[43] = new park("Pinnacles","pinn","California",36.49342659884044, -121.17887748916395);
		//45. redwood = redw, ca
		parkTable[44] = new park("Redwood","redw","California",41.21000649691776, -124.00645132971894);
		//46. rocky mountains = romo, co 
		parkTable[45] = new park("Rocky Mountain","romo","Colorado",40.33473209538776, -105.67112142336791);
		//47. saguaro = sagu, az
		parkTable[46] = new park("Saguaro","sagu","Arizona",32.29094740791006, -111.15612606186167);
		//48. shenandoah = shen, va
		parkTable[47] = new park("Shenandoah","shen","Virginia",38.468126756099416, -78.46461809064188);
		//49. theodore roosevelt = thro, nd 
		parkTable[48] = new park("Theodore Roosevelt","thro","North Dakota",46.98094000447469, -103.53965550182048);
		//50. virgin islands = viis, virgin islands 
		parkTable[49] = new park("Virgin Islands","viis","Virgin Islands",18.351660513213467, -64.7311558861534);
		//51. voyaguers = voya, minnesota
		parkTable[50] = new park("Voyaguers","voya","Minnesota",48.467232151928364, -92.84760764205036);
		//52. white sands = whsa, new mexico
		parkTable[51] = new park("White Sands","whsa","New Mexico",32.786987447966766, -106.32546706024645);
		//53. wind cave = wica, south dakota
		parkTable[52] = new park("Wind Cave","wica","South Dakota",43.571256746877026, -103.43791831710911);
		//54. wrangell-st. elias = wrst, ak
		parkTable[53] = new park("Wrangell-St. Elias","wrst","Alaska",61.78424340825033, -142.91313992381356);
		//55. yellowstone = yell, id/montana/wy
		parkTable[54] = new park("Yellowstone","yell","Idaho, Montana, Wyoming",44.434550942599394, -110.590023944135);
		//56. yosemite = yose, ca
		parkTable[55] = new park("Yosemite","yose","California",37.85632476791969, -119.5320256779469);
		//57. zion = zion, utah 
		parkTable[56] = new park("Zion","zion","Utah",37.29554847345717, -113.03091119852232);
	}
	
	public void displayTable()
	{
		for(int i = 0; i < parkTable.length; i++)
		{
			System.out.println("PARK: "+parkTable[i].name+" CODE: "+parkTable[i].parkCode+" STATE: "+parkTable[i].state);
		}
	}
}

