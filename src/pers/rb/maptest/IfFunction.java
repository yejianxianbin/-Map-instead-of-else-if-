package pers.rb.maptest;

import java.util.Map;

public class IfFunction<K> {

	private Map<K, Function> map;

	// IfFunction需要一个map来保存keys和functions
	public IfFunction(Map<K, Function> map) {
		this.map = map;
	}

	// 添加 key和function到map中，function将在key存在时执行。
	public IfFunction<K> add(K key, Function function) {
		this.map.put(key, function);
		return this;
	}

	// 确定键是否存在，如果存在，则执行相应的方法。
	public void doIf(K key) {
		if (this.map.containsKey(key)) {
			map.get(key).invoke();
		}
	}

	// doIfWithDefault的意思是当找不到对应的key时，调用default方法，就像switch里的default一样
	public void doIfWithDefault(K key, Function defaultFunction) {
		if (this.map.containsKey(key)) {

			map.get(key).invoke();
		} else {
			defaultFunction.invoke();
		}
	}
}