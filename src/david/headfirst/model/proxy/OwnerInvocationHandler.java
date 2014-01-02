package david.headfirst.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	IPersonBean personBean;

	public OwnerInvocationHandler(IPersonBean personBean) {
		this.personBean = personBean;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(personBean, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException("你没有权限操作此方法");
			} else if (method.getName().startsWith("set")) {
				return method.invoke(personBean, args);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}
}
