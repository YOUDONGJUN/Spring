package com.bit.spring.handler;

import com.bit.spring.model.UserCustomDetails;
import com.bit.spring.model.UserDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Service
public class UserAuthSuccessHandler implements AuthenticationSuccessHandler {

    private static final Logger LOGGER = LogManager.getLogger(UserAuthSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        UserDTO userDTO = ((UserCustomDetails) authentication.getPrincipal()).getUserDTO();
        userDTO.setPassword(null);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("logIn", userDTO);

        String message = "사용자" + userDTO.getUsername() + "님이 로그인 하셨음ㅋㅋ";
        LOGGER.info(message);

        httpServletResponse.sendRedirect("/board/showAll/1");
    }
}















