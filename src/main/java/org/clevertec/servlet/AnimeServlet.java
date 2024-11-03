package org.clevertec.servlet;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.clevertec.dto.Anime;
import org.clevertec.mapper.AnimeMapper;
import org.clevertec.mapper.AnimeMapperImpl;
import org.clevertec.service.AnimeService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static javax.servlet.http.HttpServletResponse.SC_OK;

@WebServlet(name = "anime-servlet", value = "/")
@Slf4j
public class AnimeServlet extends HttpServlet {

    private final AnimeService animeService = new AnimeService();
    private final AnimeMapper animeMapper = new AnimeMapperImpl();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        log.info("init method from AnimeServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        List<Anime> accounts = animeMapper.toDomains(animeService.findAll());
        String json = new Gson().toJson(accounts);
        try (PrintWriter out = resp.getWriter()) {
            out.write(json);
            resp.setStatus(SC_OK);
        }
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws IOException {
//        Anime anime = new Gson().fromJson(req.getReader(), Anime.class);
//        String json = new Gson().toJson(accountService.save(accountDto));
//        try (PrintWriter out = resp.getWriter()) {
//            out.write(json);
//            resp.setStatus(SC_CREATED);
//        }
//    }

    @Override
    public void destroy() {
        super.destroy();
        log.info("destroy method from AnimeServlet");
    }
}
