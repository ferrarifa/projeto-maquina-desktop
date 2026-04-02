create database gerenciador;

create table usuarios (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    usuario VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    admin BOOLEAN DEFAULT FALSE
);

INSERT INTO usuarios (nome, usuario, senha, admin) VALUES
('Iago Barbosa', 'iago.barbosa', '132224', TRUE),
('Joao de Santo Cristo', 'santo.cristo', '123456', FALSE),
('Edward Elrick', 'ed.elrick', '123456', FALSE),
('Gon Freecss', 'hunter.gon', '123456', FALSE);

SELECT * FROM usuarios;
#--------------------------------------------------------------#

create table pecas (
	id_peca INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(100),
    codigo_fabricante VARCHAR(50),
    tipo VARCHAR(50), -- agulha, pedal, motor, correia
    material VARCHAR(50), -- aço, plástico, borracha
    compatibilidade VARCHAR(100), -- modelos de máquinas compatíveis
    quantidade_estoque INT DEFAULT 0,
    preco DECIMAL(10,2),
    fornecedor VARCHAR(100)
);
SELECT * FROM pecas;
insert into pecas (nome, descricao, codigo_fabricante, tipo, material, compatibilidade, quantidade_estoque, preco, fornecedor) VALUES
('Agulha nº 14', 'Agulha para tecidos médios', 'AG-14', 'Agulha', 'Aço', 'Singer, Brother', 200, 1.50, 'Fornecedor A'),
('Pedal eletrônico', 'Pedal de controle eletrônico', 'PD-EL01', 'Pedal', 'Plástico', 'Singer, Janome', 50, 120.00, 'Fornecedor B'),
('Correia de borracha', 'Correia para motor pequeno', 'CR-22', 'Correia', 'Borracha', 'Singer antiga', 80, 15.00, 'Fornecedor C'),
('Carretel plástico', 'Carretel para linha', 'CT-PL01', 'Carretel', 'Plástico', 'Universal', 500, 0.80, 'Fornecedor D'),
('Motor 110V', 'Motor elétrico para máquina doméstica', 'MT-110', 'Motor', 'Metal', 'Singer, Brother', 20, 250.00, 'Fornecedor E'),
('Lâmpada LED', 'Lâmpada para iluminação da costura', 'LP-LED', 'Lâmpada', 'Vidro/Metal', 'Universal', 100, 12.00, 'Fornecedor F'),
('Placa de agulha', 'Placa metálica sob a agulha', 'PL-AG01', 'Placa', 'Aço inox', 'Singer, Brother', 40, 35.00, 'Fornecedor G'),
('Bobina metálica', 'Bobina para linha inferior', 'BB-MT01', 'Bobina', 'Metal', 'Universal', 300, 1.20, 'Fornecedor H'),
('Calcador para zíper', 'Calcador especial para costura de zíper', 'CL-ZP01', 'Calcador', 'Metal', 'Singer, Brother, Janome', 70, 18.00, 'Fornecedor I'),
('Tensão de linha', 'Conjunto regulador de tensão da linha', 'TS-LN01', 'Regulador', 'Metal/Plástico', 'Singer, Brother', 25, 45.00, 'Fornecedor J');



