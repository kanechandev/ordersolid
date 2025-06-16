# 🧾 Sistema de Pedido - Refatorado com SOLID

Este projeto simula um sistema simples de pedido, aplicando princípios de design orientados a objetos, com foco especial no princípio da responsabilidade única (SRP) do SOLID.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Maven
- Padrões SOLID (com ênfase no SRP)

---

## 🧱 Estrutura das Classes

### `Item`
Representa um item do pedido, com nome e preço.

### `Order`
Responsável exclusivamente por armazenar e gerenciar a lista de itens.

### `OrderCalculator`
Responsável por realizar o cálculo do total do pedido. Essa separação garante maior coesão e aderência ao princípio da responsabilidade única (SRP).

---

## 💡 Exemplo de Uso

```java
Order order = new Order();
order.addItem(new Item("Notebook", 3500.00));
order.addItem(new Item("Mouse", 150.00));

OrderCalculator calculator = new OrderCalculator();
double total = calculator.calculateTotal(order);

System.out.printf("Total do pedido: R$ %.2f%n", total);
```

---

## ✅ Justificativa Técnica

A separação entre as classes segue o princípio SRP:
- `Order` tem apenas a responsabilidade de armazenar itens.
- `OrderCalculator` cuida do processamento do total.

Essa abordagem favorece manutenção e testes unitários.

---

## ✍️ Autor

**Kane San Chan**  
Desenvolvedor Java e entusiasta de boas práticas de arquitetura, qualidade de código e documentação de APIs.

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Fique à vontade para usar, modificar e distribuir.