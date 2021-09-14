import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom"

function Home() {
    return (
        <>
        <NavBar />
        <div className="container">
            <div className="jumbotron">
                <h1 className="display-4">DSVendas</h1>
                <p className="lead">Analise  o desempenho das suas vendas</p>
                <hr />
                <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos pelo back end construido com spring boot</p>
                <Link className="btn btn-primary btn-lg" to="/dashboard">
                    Acessar dashboard
                </Link>
            </div>
        </div>
        <Footer />
        </>
    );
}

export default Home;