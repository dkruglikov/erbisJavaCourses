package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

public final class QueueMetrics {

	private static final short OPERATION_COUNT = 4096;

	private QueueMetrics() {
	}

	public static void main(String[] args) throws EmptyQueueException {
		measureAdd(new ArrayQueue());
		measureAdd(new QueueImpl());
		measureRemove(new ArrayQueue());
		measureRemove(new QueueImpl());
		measureAll(new ArrayQueue());
		measureAll(new QueueImpl());
	}

	private static void measureAdd(Queue queue) {
		System.out.println("Measuring adding elements...");
		long start = System.currentTimeMillis();
		for (int i = 0; i < OPERATION_COUNT; i++) {
			queue.add(String.valueOf(i));
		}
		long finish = System.currentTimeMillis();
		System.out.print(queue.getClass().getName());
		System.out.print(": ");
		System.out.print(finish - start);
		System.out.println(" ms");
	}

	private static void measureRemove(Queue queue) throws EmptyQueueException {
		for (int i = 0; i < OPERATION_COUNT; i++) {
			queue.add(String.valueOf(i));
		}
		System.out.println("Measuring removing elements...");
		long start = System.currentTimeMillis();
		while (!queue.isEmpty()) {
			queue.poll();
		}
		long finish = System.currentTimeMillis();
		System.out.print(queue.getClass().getName());
		System.out.print(": ");
		System.out.print(finish - start);
		System.out.println(" ms");
	}

	private static void measureAll(Queue queue) throws EmptyQueueException {
		System.out.println("Measuring everything...");
		long start = System.currentTimeMillis();
		for (int i = OPERATION_COUNT; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				queue.add(String.valueOf(j));
			}
			for (int j = i; j >= 0 && !queue.isEmpty(); j--) {
                queue.poll();
				}
			}
		long finish = System.currentTimeMillis();
		System.out.print(queue.getClass().getName());
		System.out.print(": ");
		System.out.print(finish - start);
		System.out.println(" ms");
	}
}
