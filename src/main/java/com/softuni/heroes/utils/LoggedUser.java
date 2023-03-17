package com.softuni.heros.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@NoArgsConstructor
@SessionScope
@Component
public class LoggedUser {

    private String id;

    private String username;

    public boolean isLogged() {
        return this.username != null && this.id != null;
    }
}
