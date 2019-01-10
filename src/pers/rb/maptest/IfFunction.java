package pers.rb.maptest;

import java.util.Map;

public class IfFunction<K> {

	private Map<K, Function> map;

	// IfFunction��Ҫһ��map������keys��functions
	public IfFunction(Map<K, Function> map) {
		this.map = map;
	}

	// ��� key��function��map�У�function����key����ʱִ�С�
	public IfFunction<K> add(K key, Function function) {
		this.map.put(key, function);
		return this;
	}

	// ȷ�����Ƿ���ڣ�������ڣ���ִ����Ӧ�ķ�����
	public void doIf(K key) {
		if (this.map.containsKey(key)) {
			map.get(key).invoke();
		}
	}

	// doIfWithDefault����˼�ǵ��Ҳ�����Ӧ��keyʱ������default����������switch���defaultһ��
	public void doIfWithDefault(K key, Function defaultFunction) {
		if (this.map.containsKey(key)) {

			map.get(key).invoke();
		} else {
			defaultFunction.invoke();
		}
	}
}