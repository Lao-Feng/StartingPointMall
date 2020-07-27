package mall.staringpoint.core.annotation;

import mall.staringpoint.core.base.UserSession;
import mall.staringpoint.core.constant.UserHeaderField;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;



/**
 * {@link LoginUser} 配置
 *
 * @Author: FengJie
 * @Date: 2020/7/26 15:49
 */
public class LoginUserArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(UserSession.class) && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {

        // TODO: 2019/7/27 这里需要根据实际情况封装User对象

        String userId = request.getHeader(UserHeaderField.USER_ID);
        return UserSession.builder()
                .id(userId)
                .build();
    }
}
