USE massaspotiguar;

DROP TABLE IF EXISTS Login;

CREATE TABLE Login(
id int PRIMARY KEY AUTO_INCREMENT,
nome varchar(30),
login varchar(100),
senha text,
tipo varchar(30)
);

INSERT INTO Login(nome, login, senha, tipo) VALUES
('João', 'joao@gmail.com', 'joaoabcd', 'gerente'),
('Vander', 'vander@gmail.com', 'vander22k', 'Produção'),
('Carla', 'carla@gmail.com', '1234abcdef', 'Produção'),
('Márcia', 'marcia@gmail.com', 'guilherme22', 'Entregador'),
('Paulo', 'paulo@gmail.com', 'hosana1925', 'Entregador'),
('José', 'jose@gmail.com', 'Jesus5912', 'Entregador');
cadastrobiscoito