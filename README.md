# fintech

## Exemplo de output dos testes:
```declarative
/home/mneves/.jdks/corretto-23.0.2/bin/java -javaagent:/snap/intellij-idea-community/588/lib/idea_rt.jar=33527 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/mneves/Downloads/fintech/target/classes br.com.fiap.fintech.test.Main
Banco: Banco Itau
Código: 001
Agência: 1234
Conta: 56789-0
Nome do cartão: Mastercard Uniclass Black
Últimos 4 dígitos: 1234
Bandeira: mastercard
Tipo: Crédito
Proprietário: Marcus Neves
Marcus Neves está logando com o e-mail: marcus.neves@fiap.com.br
### Receita ###
Detalhes da Transação de Receita:
Transação: b0257fc3-7929-41d3-8565-990327a888e1
Descrição: Salário
Valor: 5000.0
Data: 2025-03-18T19:38:12.472220206
Categoria: Receitas
Pagador: Empresa XYZ

### Despesa ###
Detalhes da Transação de Despesa:
Transação: 9da88c0b-de61-4d2f-8c31-50d22693ebf8
Descrição: Pagamento de Aluguel
Valor: 1500.0
Data: 2025-03-18T19:38:12.476090455
Categoria: Despesas
Pagador: br.com.fiap.fintech.model.Bank@4f2410ac

Process finished with exit code 0
```