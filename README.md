# Controle de Notebooks

Neste projeto iremos criar uma aplicação Web e uma API para o controle de uso dos notebooks da Sala Maker.

```mermaid
    erDiagram
        notebook ||--|{ registro : contains        
        aluno ||--|{ registro : contains
        professor ||--|{ registro : contains 
        disciplina ||--|{ registro : contains  
        curso ||--|{ curso_disciplinas : contains 
        disciplina ||--|{ curso_disciplinas : contains 


        aluno {
            int rm            
            varchar nome

        }
        professor {
            int id
            varchar nome
        }
        curso {
            int id
            varchar nome
            varchar descricao
        }
        disciplina {
            int id
            int id_curso
            varchar descricao
            int id_professor
            enum dia_semana
        }
        curso_disciplinas {
            int id
            int id_curso
            int id_professor
        }

        notebook {
            int id
            enum marca
            enum modelo
        }
        registro {
            int id
            int id_professor
            int id_notebook
            int id_aluno
            int id_disciplina
            timestamp datahorainicio
            timestamp datahoratermino
        }

```

## Grupos

Num | Integrantes                       | Tema
-- |-----------------------------------| --
1 | Pedro Beck, Pedro Otavio, Giovani | Disciplina
2 | Maria Beatriz, Valdir             | Professor
3 | Tiago R, Carlos, Vitor Fellizatti | Aluno 
4 | Vinicius, Tiago Alvares, Mateus M | Notebook
5 | Guilerme, Chiara, Thiago Barros   | Locação
6 | Pablo, Kauan, Lucas Teodoro | Curso com relacionamento de disciplinas