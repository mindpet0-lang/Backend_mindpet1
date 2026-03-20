package com.example.mindPet.Model;

public class loginResponse {

        private String token;
        private Usuario usuario;

        public LoginResponse(String token, Usuario usuario) {
            this.token = token;
            this.usuario = usuario;
        }

        public String getToken() {
            return token;
        }

        public Usuario getUsuario() {
            return usuario;
        }
}
