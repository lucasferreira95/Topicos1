insert into usuarioWeb (login, senha, tipoUsuario) values ('admin2', '123', 1);
insert into usuarioWeb (login, senha, tipoUsuario) values ('cliente1', '123', 2);
insert into usuarioWeb (login, senha, tipoUsuario) values ('cliente2', '123', 2);

insert into endereco (logradouro, cidade, estado, cep) values ('1004 sul...', 'Palmas', 'TO', '77000000');
insert into endereco (logradouro, cidade, estado, cep) values ('604 sul...', 'Palmas', 'TO', '77000000');
insert into endereco (logradouro, cidade, estado, cep) values ('1104 sul...', 'Palmas', 'TO', '77000000');
insert into endereco (logradouro, cidade, estado, cep) values ('303 sul...', 'Palmas', 'TO', '77000000');

insert into ponta (espessura, tipo) values (0.5, 'esferografica');
insert into ponta (espessura, tipo) values (0.9, 'tinteira');
insert into ponta (espessura, tipo) values (1.6, 'canetao');
insert into ponta (espessura, tipo) values (1.2, 'marca texto');

insert into fabricante (nome, cnpj, contato, cep) values ('BIC', '123','(63) 955555551', 77000000);
insert into fabricante (nome, cnpj, contato, cep) values ('Compactor', '321','(63) 955555551', 77000000);
insert into fabricante (nome, cnpj, contato, cep) values ('Faber-Castel', '789','(63) 955555551', 77000000);

insert into lote (codigo, quantidade, dataFabricacao) values ('1515', 50, '2024-10-10');
insert into lote (codigo, quantidade, dataFabricacao) values ('1414', 50, '2024-10-10');
insert into lote (codigo, quantidade, dataFabricacao) values ('1518', 50, '2024-10-10');
insert into lote (codigo, quantidade, dataFabricacao) values ('1615', 50, '2024-10-10');