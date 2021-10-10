package co.edu.utp.misiontic2022.ciclo02.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.utp.misiontic2022.ciclo02.model.dao.ComprasDeLiderDao;
import co.edu.utp.misiontic2022.ciclo02.model.dao.PagadoPorProyectoDao;
import co.edu.utp.misiontic2022.ciclo02.model.dao.ProyectoBancoDao;
import co.edu.utp.misiontic2022.ciclo02.model.vo.ComprasDeLiderVo;
import co.edu.utp.misiontic2022.ciclo02.model.vo.PagadoPorProyectoVo;
import co.edu.utp.misiontic2022.ciclo02.model.vo.ProyectoBancoVo;

public class ReportesController {
    private ProyectoBancoDao proyectoBancoDao;
    private PagadoPorProyectoDao pagadoPorProyectoDao;
    private ComprasDeLiderDao comprasDeLiderDao;

    public ReportesController() {
        proyectoBancoDao = new ProyectoBancoDao();
        pagadoPorProyectoDao = new PagadoPorProyectoDao();
        comprasDeLiderDao = new ComprasDeLiderDao();
    }

    public List<ProyectoBancoVo> listadoProyectoBanco(String banco) throws SQLException {
        return proyectoBancoDao.listarProyectosBanco(banco);
    }

    public List<PagadoPorProyectoVo> listarPagos(Double limiteinferior) throws SQLException {
        return pagadoPorProyectoDao.listarPagoProyecto(limiteinferior);
    }

    public List<ComprasDeLiderVo> listarComprasLider() throws SQLException {
        return comprasDeLiderDao.lsitarComprasLider();
    }
}
