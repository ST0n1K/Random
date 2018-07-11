public class Random {
	public static void main(String[] args) {
		String[] wordListOne = {"model", "infect", "persist", "bottle", "cooperation", "clothes","rotation", "hole", "franchise", "fountain"};
		String[] wordListTwo = {"displace", "uniform", "discover", "community", "occasion", "brush","abortion", "level", "practical", "basic"};
		String[] wordListThree = {"radical", "adoption", "ask", "sword", "pair", "delivery","paragraph", "building", "dressing", "nationalism"};
		String[] wordListFour = {"scatter", "prince", "instal", "low", "angle", "rate","cook", "worker", "inch", "defendant"};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		int fourLength = wordListFour.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		int rand4 = (int) (Math.random() * fourLength);

		String res = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4];

		System.out.println("All you need is... " + res);

	}
}