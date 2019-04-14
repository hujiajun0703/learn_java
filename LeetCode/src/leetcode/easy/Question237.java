package leetcode.easy;
/**
 * 删除链表中的节点
 * 方法参数里给的node就是要删除的节点
 * 由于没有提供头部信息，所以消失的其实是要删除节点的下一个节点，
 * 要删除的节点中的属性，被下一个节点的信息覆盖，下一个节点的实例对象引用计数为0
 * 等待被GC回收
 *
 */
public class Question237 {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}