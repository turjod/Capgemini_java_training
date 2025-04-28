package hashMapImplementation;

public class HashMapImplementation {
	Entry buckets[]=new Entry[16];
	public int getBucketIndex(int key) {
		return Math.abs(key)%buckets.length;
	}
}
