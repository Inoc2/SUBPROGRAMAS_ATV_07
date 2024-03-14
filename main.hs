import Data.List
type Evento = String
type Agenda = [Evento]

main :: IO ()
main = do
    putStrLn "Bem-vindo ao Gerenciador de Agenda!"
    loop []

loop :: Agenda -> IO ()
loop agenda = do
    putStrLn "\nSelecione uma opção:"
    putStrLn "1. Adicionar evento"
    putStrLn "2. Remover evento"
    putStrLn "3. Visualizar agenda"
    putStrLn "4. Sair"
    opcao <- getLine
    case opcao of
        "1" -> do
            putStrLn "Digite o evento a ser adicionado:"
            evento <- getLine
            let novaAgenda = agenda ++ [evento]
            loop novaAgenda
        "2" -> do
            putStrLn "Digite o índice do evento a ser removido:"
            indice <- getLine
            let novaAgenda = delete (agenda !! (read indice)) agenda                
            loop novaAgenda
        "3" -> do
            putStrLn "Eventos na Agenda:"
            mapM_ putStrLn agenda
            loop agenda
        "4" -> putStrLn "Saindo do programa..."
        _   -> do
            putStrLn "Opção inválida. Tente novamente."
            loop agenda
