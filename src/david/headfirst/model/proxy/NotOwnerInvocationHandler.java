package david.headfirst.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotOwnerInvocationHandler implements InvocationHandler {
	IPersonBean personBean;

	public NotOwnerInvocationHandler(IPersonBean personBean) {
		// TODO Auto-generated constructor stub
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			if (method.getName().startsWith("get") || method.getName().equals("setHotOrNotRating")) {
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException("你没有权限操作此方法");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

}
