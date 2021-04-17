package itis.socialtest;


import itis.socialtest.entities.Post;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*
 * В папке resources находятся два .csv файла.
 * Один содержит данные о постах в соцсети в следующем формате: Id автора, число лайков, дата, текст
 * Второй содержит данные о пользователях  - id, никнейм и дату рождения
 *
 * Напишите код, который превратит содержимое файлов в обьекты в package "entities"
 * и осуществите над ними следующие опреации:
 *
 * 1. Выведите в консоль все посты в читабельном виде, с информацией об авторе.
 * 2. Выведите все посты за сегодняшнюю дату
 * 3. Выведите все посты автора с ником "varlamov"
 * 4. Проверьте, содержит ли текст хотя бы одного поста слово "Россия"
 * 5. Выведите никнейм самого популярного автора (определять по сумме лайков на всех постах)
 *
 * Для выполнения заданий 2-5 используйте методы класса AnalyticsServiceImpl (которые вам нужно реализовать).
 *
 * Требования к реализации: все методы в AnalyticsService должны быть реализованы с использованием StreamApi.
 * Использование обычных циклов и дополнительных переменных приведет к снижению баллов, но допустимо.
 * Парсинг файлов и реализация методов оцениваются ОТДЕЛЬНО
 *
 *
 * */

public class MainClass {

    private List<Post> allPosts;

    private AnalyticsService analyticsService = new AnalyticsServiceImpl();

    public static void main(String[] args) throws IOException {


        List<String> postsTxt = Files.readAllLines(Paths.get("src/itis/socialtest/resources/PostDatabase.csv"), StandardCharsets.UTF_8);
        for (String string : postsTxt) {
            List<String> split = Arrays.asList(string.split(","));

        }




    }

    private void run(String postsSourcePath, String authorsSourcePath) {

    }

}
