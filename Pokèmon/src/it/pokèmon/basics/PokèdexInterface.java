package it.pokèmon.basics;

import java.util.HashMap;

public interface PokèdexInterface {
	HashMap<Integer, String> pokèdex_u = new HashMap<Integer, String>();
	HashMap<Integer, String> pokèdex_n = new HashMap<Integer, String>();
	
	public static void setPokèdex() {
		addToPokèdex(0, "Victini");
		addToPokèdex(1, "Snivy");
		addToPokèdex(2, "Servine");
		addToPokèdex(3, "Serperior");
		addToPokèdex(4, "Tepig");
		addToPokèdex(5, "Pignite");
		addToPokèdex(6, "Emboar");
		addToPokèdex(7, "Oshawott");
		addToPokèdex(8, "Dewott");
		addToPokèdex(9, "Samurott");
		addToPokèdex(10, "Patrat");
		addToPokèdex(11, "Watchog");
		addToPokèdex(12, "Lillipup");
		addToPokèdex(13, "Herdier");
		addToPokèdex(14, "Stoutland");
		addToPokèdex(15, "Purrloin");
		addToPokèdex(16, "Liepard");
		addToPokèdex(17, "Pansage");
		addToPokèdex(18, "Simisage");
		addToPokèdex(19, "Pansear");
		addToPokèdex(20, "Simisear");
		addToPokèdex(21, "Panpour");
		addToPokèdex(22, "Simipour");
		addToPokèdex(23, "Munna");
		addToPokèdex(24, "Musharna");
		addToPokèdex(25, "Pidove");
		addToPokèdex(26, "Tranquill");
		addToPokèdex(27, "Unfezant");
		addToPokèdex(28, "Blitzle");
		addToPokèdex(29, "Zebstika");
		addToPokèdex(30, "Roggenrola");
		addToPokèdex(31, "Boldore");
		addToPokèdex(32, "Gigalith");
		addToPokèdex(33, "Woobat");
		addToPokèdex(34, "Swoobat");
		addToPokèdex(35, "Drillbur");
		addToPokèdex(36, "Excadrill");
		addToPokèdex(37, "Audino");
		addToPokèdex(38, "Timburr");
		addToPokèdex(39, "Gurdurr");
		addToPokèdex(40, "Conkeldur");
		addToPokèdex(41, "Tympole");
		addToPokèdex(42, "Palpitoad");
		addToPokèdex(43, "Seismitoad");
		addToPokèdex(44, "Throh");
		addToPokèdex(45, "Sawk");
		addToPokèdex(46, "Sewaddle");
		addToPokèdex(47, "Swadloon");
		addToPokèdex(48, "Leavanny");
		addToPokèdex(49, "Venipede");
		addToPokèdex(50, "Whirlipede");
		addToPokèdex(51, "Scolipede");
		addToPokèdex(52, "Cottonee");
		addToPokèdex(53, "Whimsicott");
		addToPokèdex(54, "Petilil");
		addToPokèdex(55, "Lilligant");
		addToPokèdex(56, "Baculin");
		addToPokèdex(57, "Sandile");
		addToPokèdex(58, "Krokorok");
		addToPokèdex(59, "Krookodile");
		addToPokèdex(60, "Darumaka");
		addToPokèdex(61, "Darmanitan");
		addToPokèdex(62, "Maractus");
		addToPokèdex(63, "Dewbble");
		addToPokèdex(64, "Crustle");
		addToPokèdex(65, "Scraggy");
		addToPokèdex(66, "Scrafty");
		addToPokèdex(67, "Sigilyph");
		addToPokèdex(68, "Yamask");
		addToPokèdex(69, "Cofagrigus");
		addToPokèdex(70, "Tirtouga");
		addToPokèdex(71, "Carracosta");
		addToPokèdex(72, "Archen");
		addToPokèdex(73, "Archeops");
		addToPokèdex(74, "Trubbish");
		addToPokèdex(75, "Garbodor");
		addToPokèdex(76, "Zorua");
		addToPokèdex(77, "Zoroark");
		addToPokèdex(78, "Minccino");
		addToPokèdex(79, "Cinccino");
		addToPokèdex(80, "Gothita");
		addToPokèdex(81, "Gothorita");
		addToPokèdex(82, "Gothitelle");
		addToPokèdex(83, "Solosis");
		addToPokèdex(84, "Duosion");
		addToPokèdex(85, "Reuniclus");
		addToPokèdex(86, "Ducklett");
		addToPokèdex(87, "Swanna");
		addToPokèdex(88, "Vanillite");
		addToPokèdex(89, "Vanillish");
		addToPokèdex(90, "Vanilluxe");
		addToPokèdex(91, "Deerling");
		addToPokèdex(92, "Sawsbuck");
		addToPokèdex(93, "Emolga");
		addToPokèdex(94, "Karrablast");
		addToPokèdex(95, "Escavalier");
		addToPokèdex(96, "Foongus");
		addToPokèdex(97, "Amoonguss");
		addToPokèdex(98, "Frillish");
		addToPokèdex(99, "Jellicent");
		addToPokèdex(100, "Alomomola");
		addToPokèdex(101, "Joltik");
		addToPokèdex(102, "Galvantula");
		addToPokèdex(103, "Ferroseed");
		addToPokèdex(104, "Ferrothorn");
		addToPokèdex(105, "Klink");
		addToPokèdex(106, "Klang");
		addToPokèdex(107, "Klinklang");
		addToPokèdex(108, "Tynamo");
		addToPokèdex(109, "Eelektrik");
		addToPokèdex(110, "Eelektross");
		addToPokèdex(111, "Elgyem");
		addToPokèdex(112, "Beheeyem");
		addToPokèdex(113, "Litwick");
		addToPokèdex(114, "Lampent");
		addToPokèdex(115, "Chandelure");
		addToPokèdex(116, "Axew");
		addToPokèdex(117, "Fraxure");
		addToPokèdex(118, "Haxorus");
		addToPokèdex(119, "Cubchoo");
		addToPokèdex(120, "Beartic");
		addToPokèdex(121, "Cryogonal");
		addToPokèdex(122, "Shelmet");
		addToPokèdex(123, "Accelgor");
		addToPokèdex(124, "Stunfisk");
		addToPokèdex(125, "Mienfoo");
		addToPokèdex(126, "Mienshao");
		addToPokèdex(127, "Druddigon");
		addToPokèdex(128, "Golett");
		addToPokèdex(129, "Golurk");
		addToPokèdex(130, "Pawniard");
		addToPokèdex(131, "Bisharp");
		addToPokèdex(132, "Bouffalant");
		addToPokèdex(133, "Rufflet");
		addToPokèdex(134, "Braviary");
		addToPokèdex(135, "Vullaby");
		addToPokèdex(136, "Mandibuzz");
		addToPokèdex(137, "Heatmor");
		addToPokèdex(138, "Durant");
		addToPokèdex(139, "Deino");
		addToPokèdex(140, "Zweilous");
		addToPokèdex(141, "Hydreigon");
		addToPokèdex(142, "Larvesta");
		addToPokèdex(143, "Volcarona");
		addToPokèdex(144, "Cobalion");
		addToPokèdex(145, "Terrakion");
		addToPokèdex(146, "Virizion");
		addToPokèdex(147, "Tornadus");
		addToPokèdex(148, "Thundurus");
		addToPokèdex(149, "Reshiram");
		addToPokèdex(150, "Zekrom");
		addToPokèdex(151, "Landorus");
		addToPokèdex(152, "Kyurem");
		addToPokèdex(153, "Keldeo");
		addToPokèdex(154, "Meloetta");
		addToPokèdex(155, "Genesect");
	}
	
	public static void setPokèdex_n() {
		addToPokèdex_n(494, "Victini");
		addToPokèdex_n(495, "Snivy");
		addToPokèdex_n(496, "Servine");
		addToPokèdex_n(497, "Serperior");
		addToPokèdex_n(498, "Tepig");
		addToPokèdex_n(499, "Pignite");
		addToPokèdex_n(500, "Emboar");
		addToPokèdex_n(501, "Oshawott");
		addToPokèdex_n(502, "Dewott");
		addToPokèdex_n(503, "Samurott");
		addToPokèdex_n(504, "Patrat");
		addToPokèdex_n(505, "Watchog");
		addToPokèdex_n(506, "Lillipup");
		addToPokèdex_n(507, "Herdier");
		addToPokèdex_n(508, "Stoutland");
		addToPokèdex_n(509, "Purrloin");
		addToPokèdex_n(510, "Liepard");
		addToPokèdex_n(511, "Pansage");
		addToPokèdex_n(512, "Simisage");
		addToPokèdex_n(513, "Pansear");
		addToPokèdex_n(514, "Simisear");
		addToPokèdex_n(515, "Panpour");
		addToPokèdex_n(516, "Simipour");
		addToPokèdex_n(517, "Munna");
		addToPokèdex_n(518, "Musharna");
		addToPokèdex_n(519, "Pidove");
		addToPokèdex_n(520, "Tranquill");
		addToPokèdex_n(521, "Unfezant");
		addToPokèdex_n(522, "Blitzle");
		addToPokèdex_n(523, "Zebstika");
		addToPokèdex_n(524, "Roggenrola");
		addToPokèdex_n(525, "Boldore");
		addToPokèdex_n(526, "Gigalith");
		addToPokèdex_n(527, "Woobat");
		addToPokèdex_n(528, "Swoobat");
		addToPokèdex_n(529, "Drillbur");
		addToPokèdex_n(530, "Excadrill");
		addToPokèdex_n(531, "Audino");
		addToPokèdex_n(532, "Timburr");
		addToPokèdex_n(533, "Gurdurr");
		addToPokèdex_n(534, "Conkeldur");
		addToPokèdex_n(535, "Tympole");
		addToPokèdex_n(536, "Palpitoad");
		addToPokèdex_n(537, "Seismitoad");
		addToPokèdex_n(538, "Throh");
		addToPokèdex_n(539, "Sawk");
		addToPokèdex_n(540, "Sewaddle");
		addToPokèdex_n(541, "Swadloon");
		addToPokèdex_n(542, "Leavanny");
		addToPokèdex_n(543, "Venipede");
		addToPokèdex_n(544, "Whirlipede");
		addToPokèdex_n(545, "Scolipede");
		addToPokèdex_n(546, "Cottonee");
		addToPokèdex_n(547, "Whimsicott");
		addToPokèdex_n(548, "Petilil");
		addToPokèdex_n(549, "Lilligant");
		addToPokèdex_n(550, "Baculin");
		addToPokèdex_n(551, "Sandile");
		addToPokèdex_n(552, "Krokorok");
		addToPokèdex_n(553, "Krookodile");
		addToPokèdex_n(554, "Darumaka");
		addToPokèdex_n(555, "Darmanitan");
		addToPokèdex_n(556, "Maractus");
		addToPokèdex_n(557, "Dewbble");
		addToPokèdex_n(558, "Crustle");
		addToPokèdex_n(559, "Scraggy");
		addToPokèdex_n(560, "Scrafty");
		addToPokèdex_n(561, "Sigilyph");
		addToPokèdex_n(562, "Yamask");
		addToPokèdex_n(563, "Cofagrigus");
		addToPokèdex_n(564, "Tirtouga");
		addToPokèdex_n(565, "Carracosta");
		addToPokèdex_n(566, "Archen");
		addToPokèdex_n(567, "Archeops");
		addToPokèdex_n(568, "Trubbish");
		addToPokèdex_n(569, "Garbodor");
		addToPokèdex_n(570, "Zorua");
		addToPokèdex_n(571, "Zoroark");
		addToPokèdex_n(572, "Minccino");
		addToPokèdex_n(573, "Cinccino");
		addToPokèdex_n(574, "Gothita");
		addToPokèdex_n(575, "Gothorita");
		addToPokèdex_n(576, "Gothitelle");
		addToPokèdex_n(577, "Solosis");
		addToPokèdex_n(578, "Duosion");
		addToPokèdex_n(579, "Reuniclus");
		addToPokèdex_n(580, "Ducklett");
		addToPokèdex_n(581, "Swanna");
		addToPokèdex_n(582, "Vanillite");
		addToPokèdex_n(583, "Vanillish");
		addToPokèdex_n(584, "Vanilluxe");
		addToPokèdex_n(585, "Deerling");
		addToPokèdex_n(586, "Sawsbuck");
		addToPokèdex_n(587, "Emolga");
		addToPokèdex_n(588, "Karrablast");
		addToPokèdex_n(589, "Escavalier");
		addToPokèdex_n(590, "Foongus");
		addToPokèdex_n(591, "Amoonguss");
		addToPokèdex_n(592, "Frillish");
		addToPokèdex_n(593, "Jellicent");
		addToPokèdex_n(594, "Alomomola");
		addToPokèdex_n(595, "Joltik");
		addToPokèdex_n(596, "Galvantula");
		addToPokèdex_n(597, "Ferroseed");
		addToPokèdex_n(598, "Ferrothorn");
		addToPokèdex_n(599, "Klink");
		addToPokèdex_n(600, "Klang");
		addToPokèdex_n(601, "Klinklang");
		addToPokèdex_n(602, "Tynamo");
		addToPokèdex_n(603, "Eelektrik");
		addToPokèdex_n(604, "Eelektross");
		addToPokèdex_n(605, "Elgyem");
		addToPokèdex_n(606, "Beheeyem");
		addToPokèdex_n(607, "Litwick");
		addToPokèdex_n(608, "Lampent");
		addToPokèdex_n(609, "Chandelure");
		addToPokèdex_n(610, "Axew");
		addToPokèdex_n(611, "Fraxure");
		addToPokèdex_n(612, "Haxorus");
		addToPokèdex_n(613, "Cubchoo");
		addToPokèdex_n(614, "Beartic");
		addToPokèdex_n(615, "Cryogonal");
		addToPokèdex_n(616, "Shelmet");
		addToPokèdex_n(617, "Accelgor");
		addToPokèdex_n(618, "Stunfisk");
		addToPokèdex_n(619, "Mienfoo");
		addToPokèdex_n(620, "Mienshao");
		addToPokèdex_n(621, "Druddigon");
		addToPokèdex_n(622, "Golett");
		addToPokèdex_n(623, "Golurk");
		addToPokèdex_n(624, "Pawniard");
		addToPokèdex_n(625, "Bisharp");
		addToPokèdex_n(626, "Bouffalant");
		addToPokèdex_n(627, "Rufflet");
		addToPokèdex_n(628, "Braviary");
		addToPokèdex_n(629, "Vullaby");
		addToPokèdex_n(630, "Mandibuzz");
		addToPokèdex_n(631, "Heatmor");
		addToPokèdex_n(632, "Durant");
		addToPokèdex_n(633, "Deino");
		addToPokèdex_n(634, "Zweilous");
		addToPokèdex_n(635, "Hydreigon");
		addToPokèdex_n(636, "Larvesta");
		addToPokèdex_n(637, "Volcarona");
		addToPokèdex_n(638, "Cobalion");
		addToPokèdex_n(639, "Terrakion");
		addToPokèdex_n(640, "Virizion");
		addToPokèdex_n(641, "Tornadus");
		addToPokèdex_n(642, "Thundurus");
		addToPokèdex_n(643, "Reshiram");
		addToPokèdex_n(644, "Zekrom");
		addToPokèdex_n(645, "Landorus");
		addToPokèdex_n(646, "Kyurem");
		addToPokèdex_n(647, "Keldeo");
		addToPokèdex_n(648, "Meloetta");
		addToPokèdex_n(649, "Genesect");
	}
	
	public static void addToPokèdex(int n, String p) {
		pokèdex_u.put(n, p);
	}
	
	public static String getPokèmonById(int n) {
		return pokèdex_u.get(n);
	}
	
	public static void addToPokèdex_n(int n, String p) {
		pokèdex_n.put(n, p);
	}
	
	public static String getPokèmonById_n(int n) {
		return pokèdex_n.get(n);
	}
}
