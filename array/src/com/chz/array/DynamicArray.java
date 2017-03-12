package com.chz.array;

public interface DynamicArray<T> {
	 /**
	  * 数组元素的个数
	  * @return int
	  */
	 public int size();
	 /**
	  * 可容纳元素的个数
	  */
	 public int capacity();
	 /**
	  * 是否为空
	  */
	 public boolean is_empty();
	 /**
	  * 返回对应索引的元素，且若索引越界则愤然报错
	  */
	 public T at(int index);
	 /**
	  * 尾部追加一个元素
	  * @param item
	  */
	 public void push(T item);
	 /**
	  * 在指定索引中插入元素，并把后面的元素依次后移
	  */
	 public void insert(int index, T item);
	 /**
	  * 可以使用上面的 insert 函数，传参 index 为 0
	  */
	 public void prepend(T item);
	 /**
	  * 删除在数组末端的元素，并返回其值
	  */
	 public void pop();
	 /**
	  * 删除指定索引的元素，并把后面的元素依次前移
	  */
	 public void delete(int index);
	 /**
	  * 删除指定值的元素，并返回其索引（即使有多个元素）
	  */
	 public int remove(T item);
	 /**
	  * 寻找指定值的元素并返回其中第一个出现的元素其索引，若未找到则返回 -1
	  */
	 public int find(T item);
}
