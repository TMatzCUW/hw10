package hw10;

public class Player {
	private String name;
	private int age;
	
	public Player(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	static boolean binarySearch(Player[] ar, int ageSearch) {
		int start=0;
		int end=ar.length-1;
		int mid;
		
		while(end<=start) {
			mid=((start+end)/2);
			if(ar[mid].age==ageSearch) {
				return true;
			}
			else if(ageSearch<ar[mid].age) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return false;
	}
	
	static void mergeSort(Player[] ar, int start, int end) {
		if (start!=end) {
			int start1=start;
			int end1=start+((end-start)/2);
			int start2=end1+1;
			int end2=end;
			mergeSort(ar,start1,end1);
			mergeSort(ar,start2,end2);
			merge(ar,start1,end1,start2,end2);
		}
	}
	
	static void merge(Player[] ar, int start1, int end1, int start2, int end2) {
		Player[] temp=new Player[end2-start1+1];
		int pos1=start1;
		int pos2=start2;
		for(int i = 0; i < temp.length; i++)
		{
			if(pos1 <= end1 && pos2 <= end2)
			{
				if(ar[pos1].age < ar[pos2].age)
				{
					temp[i] = ar[pos1];
					pos1++;
				}
				else
				{
					temp[i] = ar[pos2];
					pos2++;
				}
			}
			else
			{
				if(pos1 > end1)
				{
					temp[i] = ar[pos2];
					pos2++;
				}
				else
				{
					temp[i] = ar[pos1];
					pos1++;
				}
			}
		}
		int posTemp=0;
		for(int i=start1; i<=end2;i++) {
			ar[i]=temp[posTemp];
			posTemp++;
		}
	}
	public void display() {
		System.out.println("Name: "+this.name+" Age: "+this.age);
	}
}
