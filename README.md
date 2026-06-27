# 🚛 CatLog — Sistema de Gestão de Frota e Logística
Projeto desenvolvido como exercício de **Programação Orientada a Objetos (POO)** em Java, simulando o núcleo de um sistema de gestão de frota para uma empresa de logística.

---

## 📚 Sobre o projeto
O CatLog permite cadastrar e gerenciar diferentes tipos de veículos (Caminhões e Vans), calcular custos de viagem, verificar necessidade de manutenção preventiva e estimar valores de seguro — tudo aplicando os pilares da POO.

---

## 📚 Estrutura de classes
```
Veiculo (classe abstrata)
├── Caminhao (implements Manutenivel, Seguravel)
└── Van

Manutenivel (interface)
Seguravel (interface)
GerenciadorFrota
Main
```
---

## 📚 Conceitos de POO aplicados
| Conceito | Onde foi aplicado |
|---|---|
| **Abstração** | Classe abstrata `Veiculo` com método `calcularCustoViagem()` |
| **Herança** | `Caminhao` e `Van` herdam de `Veiculo` |
| **Polimorfismo** | `exibirRelatorioViagem()` chama `calcularCustoViagem()` de cada tipo |
| **Interfaces** | `Manutenivel` e `Seguravel` definem comportamentos específicos |
| **Encapsulamento** | Atributos privados/protegidos com getters e setters |
| **Collections** | `List<Veiculo>` no `GerenciadorFrota` |

---

## 📚 Regras de negócio
**Cálculo de custo de viagem:**
- `Caminhao`: `distancia × custoPorKm + (R$10,00 × quantidadeEixos)`
- `Van`: `distancia × custoPorKm` + acréscimo de `R$45,00` se possuir isolamento térmico

**Manutenção preventiva:**
- Caminhões com quilometragem acima de **50.000 km** precisam de revisão

**Seguro:**
- `Caminhao`: `(capacidadeCargaMax × 2%) + (R$50,00 × quantidadeEixos)`
---

## 📁 Arquivos do projeto
```
📦 catlog
 ┣ 📄 Veiculo.java
 ┣ 📄 Caminhao.java
 ┣ 📄 Van.java
 ┣ 📄 Manutenivel.java
 ┣ 📄 Seguravel.java
 ┣ 📄 GerenciadorFrota.java
 ┗ 📄 Main.java
```

---

## 📁 Como executar
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/catlog.git
```

2. Compile os arquivos:
```bash
javac *.java
```

3. Execute:
```bash
java Main
```

> Requisito: Java 8 ou superior.
---

## 📚 Disciplina
Desenvolvido para a disciplina de **Programação Orientada a Objetos**.
